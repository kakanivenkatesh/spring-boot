package com.sample.sboot.thymeleaf.service;

import java.util.Date;
import java.util.List;

public interface ProfileService {
	
        void addAProfile(String skill, Date requireddate, Integer experience);
        
        void deleteAProfile(String skill, Long id);
        
        List atriskProfile(Date requireddate);
        
}