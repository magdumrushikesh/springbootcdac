package com.springboot.services;

import java.util.List;

import com.springboot.dto.CategoryDTO;

public interface CategoryService {
	
	public boolean addNewCategory(CategoryDTO dto);
	public CategoryDTO getCategoryById(int categoryId);
	public List<CategoryDTO> allCAtegory();
	

}
