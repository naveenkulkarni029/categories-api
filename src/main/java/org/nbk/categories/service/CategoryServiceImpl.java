package org.nbk.categories.service;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.nbk.categories.domain.Category;
import org.nbk.categories.exception.NotFoundException;
import org.nbk.categories.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Value("${server.servlet.context-path}")
	private String contextPath;

	@Value("${server.host}")
	private String applicationHost;

	@Value("${server.port}")
	private String applicationPort;

	@Override
	public Category save(Category category) {
		category.setCategoryId(UUID.randomUUID().toString());
		return categoryRepository.save(category);
	}

	@Override
	public Category getById(String categoryId) throws Exception {
		System.out.println("Context-path: " + contextPath);
		System.out.println("applicationHost: " + applicationHost);
		Category category = categoryRepository.getById(categoryId);
		if (null == category) {
			String sb = new StringBuilder(applicationHost).append(":").append(applicationPort).append(contextPath)
					.append("/").append(categoryId).toString();
			throw new NotFoundException("Category Not Found", new URI(sb));
		}
		return category;
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

}
