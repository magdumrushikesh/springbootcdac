package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.CategoryDTO;
import com.springboot.services.CategoryService;


@RestController
@RequestMapping("/category")
public class CategoryControllers {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/addCategory")
	public boolean registerCategory(@RequestBody CategoryDTO dto)
	{
		return categoryService.addNewCategory(dto);
	}
	
	

}
