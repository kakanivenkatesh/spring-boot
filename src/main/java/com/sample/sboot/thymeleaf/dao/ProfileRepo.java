package com.sample.sboot.thymeleaf.dao;

import org.springframework.data.repository.CrudRepository;

import com.sample.sboot.thymeleaf.model.ProfileInfo;

public interface ProfileRepo extends CrudRepository<ProfileInfo, Long>{
	
	ProfileInfo getBySkill(String skill);
	
}
