package service;

import entity.DevUser;

public interface DevUserService {
	
	DevUser getByCode(String devCode);

}
