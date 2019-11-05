package org.nbk.categories.service;

import java.util.List;

import org.nbk.categories.domain.Category;

public interface CategoryService {

	public Category save(Category category);

	public Category getById(String categoryId);

	public List<Category> findAll();

}
