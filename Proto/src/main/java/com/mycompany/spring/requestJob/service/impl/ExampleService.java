package com.mycompany.spring.requestJob.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring.requestJob.dao.ExampleDAO;
import com.mycompany.spring.requestJob.dao.impl.ExampleDAOImpl;
import com.mycompany.spring.requestJob.service.Service;


/**
 * {@link Service} with hard-coded input data.
 */
@org.springframework.stereotype.Service
public class ExampleService implements Service {
	
	@Autowired
	@Qualifier("exampleDAO")
	private ExampleDAO exampleDAO;
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello world!";	
	}
	
	public void getRequestJob() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:*resources/META-INF/spring/app-context.xml");
		
		System.out.println("=======> "+ctx.getBean(ExampleDAOImpl.class).toString());
		
		System.out.println("getRequestJob Service Start");
		exampleDAO.`getRequestJob();
	}

}
