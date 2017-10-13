package mapper;

import entity.DevUser;

public interface DevUserMapper {
	
	DevUser getByCode(String devCode);
}
