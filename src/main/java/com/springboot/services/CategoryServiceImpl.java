package com.springboot.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dto.CategoryDTO;
import com.springboot.entity.Category;
import com.springboot.repositories.CategoryRepositories;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepositories repository;
	
	@Override
	public boolean addNewCategory(CategoryDTO dto) {
		Category entityCategory = new Category();
		BeanUtils.copyProperties(dto, entityCategory);
		repository.save(entityCategory);
		
		return true;
	}

	@Override
	public CategoryDTO getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDTO> allCAtegory() {
		// TODO Auto-generated method stub
		return null;
	}

}
