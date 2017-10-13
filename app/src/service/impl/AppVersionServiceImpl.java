package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.AppVersionMapper;
import service.AppVersionService;

@Service("appVersionService")
public class AppVersionServiceImpl implements AppVersionService{
	@Autowired
	private AppVersionMapper appVersionMapper;

	public AppVersionMapper getAppVersionMapper() {
		return appVersionMapper;
	}

	public void setAppVersionMapper(AppVersionMapper appVersionMapper) {
		this.appVersionMapper = appVersionMapper;
	}
	
	
}
