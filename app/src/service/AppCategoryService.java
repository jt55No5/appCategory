package service;

import java.util.List;

import entity.AppCategory;

public interface AppCategoryService {
	
	/**
	 * 查询全部
	 */
	List<AppCategory> getAll();
}
