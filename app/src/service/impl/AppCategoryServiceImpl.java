package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import entity.AppCategory;
import mapper.AppCategoryMapper;
import service.AppCategoryService;

@Service("appCategoryService")
public class AppCategoryServiceImpl implements AppCategoryService{
	@Autowired
	private AppCategoryMapper appCategoryMapper;

	public AppCategoryMapper getAppCategoryMapper() {
		return appCategoryMapper;
	}

	public void setAppCategoryMapper(AppCategoryMapper appCategoryMapper) {
		this.appCategoryMapper = appCategoryMapper;
	}

	/**
	 * 查询全部
	 */
	public List<AppCategory> getAll() {
		return appCategoryMapper.getAll();
	}

	
}
