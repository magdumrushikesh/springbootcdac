package com.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category1")
public class Category {
	
		@Id
		@Column(name = "categoryId")
		int categoryId;
		
		@Column(name = "categoryName")
		String categoryName;
		
		@Column(name = "categoryDescription")
		String categoryDescription;
		
		@Column(name = "categoryImageUrl")
		String categoryImageUrl;

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryDescription() {
			return categoryDescription;
		}

		public void setCategoryDescription(String categoryDescription) {
			this.categoryDescription = categoryDescription;
		}

		public String getCategoryImageUrl() {
			return categoryImageUrl;
		}

		public void setCategoryImageUrl(String categoryImageUrl) {
			this.categoryImageUrl = categoryImageUrl;
		}
		

	


}
