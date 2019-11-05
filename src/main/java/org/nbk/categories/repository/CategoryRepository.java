package org.nbk.categories.repository;

import java.util.List;

import org.nbk.categories.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public Category save(Category category) {
		return mongoTemplate.save(category);
	}

	public List<Category> findAll() {
		return mongoTemplate.findAll(Category.class);
	}

	public Category getById(String categoryId) {
		return mongoTemplate.findOne(prepareQuery(categoryId), Category.class);
	}

	private Query prepareQuery(String categoryId) {
		CriteriaDefinition cd = Criteria.where("categoryId").is(categoryId);
		Query query = Query.query(cd);
		return query;
	}

}
