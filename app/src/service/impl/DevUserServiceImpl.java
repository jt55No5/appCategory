package service.impl;

import mapper.DevUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.DevUser;
import service.DevUserService;

@Service("devUserService")
public class DevUserServiceImpl implements DevUserService{
	@Autowired
	private DevUserMapper devUserMapper;

	public DevUserMapper getDevUserMapper() {
		return devUserMapper;
	}

	public void setDevUserMapper(DevUserMapper devUserMapper) {
		this.devUserMapper = devUserMapper;
	}

	
	public DevUser getByCode(String devCode) {
		return devUserMapper.getByCode(devCode);
	}

	
	
	
}
