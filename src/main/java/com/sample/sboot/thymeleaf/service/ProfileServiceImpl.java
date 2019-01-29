package com.sample.sboot.thymeleaf.service;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.sample.sboot.thymeleaf.model.ProfileInfo;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private long generatedKey;
    private String rescuedstring;

    public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public void addAProfile(String skill, Date requireddate, Integer experience) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("INSERT INTO ProfileInfo(skill,requireddate,experience)VALUES(?,?,?)", skill,requireddate,experience);
		
	}

	@Override
	public void deleteAProfile(String skill, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List atriskProfile(Date requireddate) {
		// TODO Auto-generated method stub
		return null;
	}

}
