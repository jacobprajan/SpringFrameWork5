package com.dev.spring5webapp.repositories;

import com.dev.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jakez on 16/02/2018.
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{


}
