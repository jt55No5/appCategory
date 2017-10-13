package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.AppInfoMapper;
import service.AppInfoService;

@Service("appInfoService")
public class AppInfoServiceImpl implements AppInfoService{
	@Autowired
	private AppInfoMapper appInfoMapper;

	public AppInfoMapper getAppInfoMapper() {
		return appInfoMapper;
	}

	public void setAppInfoMapper(AppInfoMapper appInfoMapper) {
		this.appInfoMapper = appInfoMapper;
	}

	
	
	
}
