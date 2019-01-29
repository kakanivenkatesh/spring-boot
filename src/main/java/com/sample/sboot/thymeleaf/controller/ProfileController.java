package com.sample.sboot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.sboot.thymeleaf.dao.ProfileRepo;
import com.sample.sboot.thymeleaf.service.ProfileService;

@Controller
public class ProfileController {
	
	@Autowired
    private ProfileRepo profilerepository;

    @Autowired
    private ProfileService profileservice;

    private ArrayList profileList;

    private List profilerisklist = null;
	
	
	@PostMapping(value = "/")
    public String adddog(@RequestParam("name") String skill,
                    @RequestParam("rescued") @DateTimeFormat(pattern = "yyyy-MM-dd") Date requireddate,
                    @RequestParam("vaccinated") Integer experience, Model model) {
    	profileservice.addAProfile(skill, requireddate, experience);
            System.out.println("skill = " + skill + ",requireddate = " + requireddate + ", experience = " + experience);
            return "redirect:/";
    }

}
