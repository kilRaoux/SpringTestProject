package com.project.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.project.model.Book;


public interface BookRepository extends CrudRepository <Book, Long> {
	List<Book> findByTitle(String title);
}