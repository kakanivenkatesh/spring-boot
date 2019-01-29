package com.sample.sboot.jdbc.app.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sample.sboot.jdbc.model.UserInfo;

@Repository
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SQL = "select * from user";
	
	public List<UserInfo> getUserInfo() {

        List<UserInfo> userInfo = new ArrayList<UserInfo>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

        for (Map<String, Object> row : rows) 
        {
        	UserInfo user = new UserInfo();
        	   	user.setEmpName((String)row.get("name"));
        	   	user.setEmpEmail((String)row.get("email"));

        	userInfo.add(user);
         }
        
        return userInfo;

}
}
