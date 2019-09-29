package com.test.assn.spring4.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.assn.spring4.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>  {

}
