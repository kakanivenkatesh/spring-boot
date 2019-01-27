package com.sample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {
	
	@Autowired
	private Environment env;
	
	@Value("${url}")
	 private String url;
	
	@Autowired
	private AppProperties appprops;

	
//	 @Autowired
//	    public void setGlobal(AppProperties appprops) {
//	        this.appprops = appprops;
//	    }
	
    @RequestMapping("/getInfo")
    String getCandidates() {
    	String driverClassName = env.getProperty("driverClassName");
    	String uname = appprops.getUname();
    	String pwd = appprops.getPwd();
    	    	
        return "driverClassName: " +driverClassName + "  url : "+url + "  uname : "+ uname + "  pwd : "+pwd;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
    }
}