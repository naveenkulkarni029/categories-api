package org.nbk.categories.controller;

import java.util.List;

import org.nbk.categories.domain.Category;
import org.nbk.categories.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/category")
public class CategoriesController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Category> save(@RequestBody Category category) {
		Category savedCategory = categoryService.save(category);
		return ResponseEntity.created(null).body(savedCategory);
	}

	@GetMapping(value = "/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Category> getById(@PathVariable String categoryId) {
		Category category = categoryService.getById(categoryId);
		return ResponseEntity.ok(category);
	}

	@GetMapping(value = "/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> findAll() {
		List<Category> categories = categoryService.findAll();
		return ResponseEntity.ok(categories);
	}

}
