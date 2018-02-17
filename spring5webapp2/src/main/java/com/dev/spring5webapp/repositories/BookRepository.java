package com.dev.spring5webapp.repositories;

import com.dev.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jakez on 16/02/2018.
 */
public interface BookRepository extends CrudRepository<Book, Long>{


}
