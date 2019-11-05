package org.nbk.categories.service;

import java.util.List;
import java.util.UUID;

import org.nbk.categories.domain.Category;
import org.nbk.categories.exception.NotFoundException;
import org.nbk.categories.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category save(Category category) {
		category.setCategoryId(UUID.randomUUID().toString());
		return categoryRepository.save(category);
	}

	@Override
	public Category getById(String categoryId) {
		Category category = categoryRepository.getById(categoryId);
		if(null==category) {
			throw new NotFoundException();
		}
		return category;
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

}
