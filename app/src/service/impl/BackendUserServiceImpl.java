package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.BackendUserMapper;
import service.BackendUserService;

@Service("backendUserService")
public class BackendUserServiceImpl implements BackendUserService{
	@Autowired
	private BackendUserMapper backendUserMapper;

	public BackendUserMapper getBackendUserMapper() {
		return backendUserMapper;
	}

	public void setBackendUserMapper(BackendUserMapper backendUserMapper) {
		this.backendUserMapper = backendUserMapper;
	}
	
	
}
