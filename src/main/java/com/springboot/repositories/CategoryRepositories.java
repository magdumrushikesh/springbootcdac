package com.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Category;

@Repository
public interface CategoryRepositories extends CrudRepository<Category, Integer> {

}
