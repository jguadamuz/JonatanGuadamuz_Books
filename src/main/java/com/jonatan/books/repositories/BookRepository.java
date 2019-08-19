package com.jonatan.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jonatan.books.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
                                                  // Long is the type of the Id (in Book class)
	List<Book> findAll();
	List<Book> findByDescriptionContaining(String search);
}
