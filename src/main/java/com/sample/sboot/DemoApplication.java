package com.sample.sboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
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
    	logger.info("logger.info");
    	logger.warn("logger debug");
    	logger.error("logger error");
        SpringApplication.run(DemoApplication.class, args);
    }
}