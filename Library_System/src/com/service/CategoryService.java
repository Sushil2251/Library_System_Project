package com.service;

import java.util.List;

import com.model.Category;

public interface CategoryService {
	List<CategoryService> getAllCategorys();
	int addBook(Category category);

}