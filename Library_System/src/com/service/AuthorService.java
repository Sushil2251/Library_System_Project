package com.service;

import java.util.List;

import com.model.Author;

public interface AuthorService {
	List<Author> getAllAuthors();
	int addBook(Author author);

}