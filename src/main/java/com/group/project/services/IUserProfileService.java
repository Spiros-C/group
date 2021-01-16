package com.group.project.services;

import java.util.List;
import com.group.project.entities.UserProfile;

public interface IUserProfileService {
    
    	UserProfile findByProfileId(int profileId);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
    
}
