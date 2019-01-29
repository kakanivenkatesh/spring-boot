package com.sample.sboot.jdbc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.sboot.jdbc.app.dao.UserDAO;
import com.sample.sboot.jdbc.model.UserInfo;

@RestController
public class UserInfoController {
	
	@Autowired
	public UserDAO userdao;
	
	@RequestMapping("/getuserInfo")
    public List<UserInfo> getuserInformation() {
        List<UserInfo> userInfo = userdao.getUserInfo();
        return userInfo;
    }

}
