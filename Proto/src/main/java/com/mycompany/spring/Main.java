/**
 * 
 */
package com.mycompany.spring;

import com.mycompany.spring.requestJob.service.impl.ExampleService;

/**
 * @author home
 *
 */
public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleService exampleService = new ExampleService();
		
		System.out.println("=-====> "+exampleService.getMessage()); 
		exampleService.getRequestJob();
				

	}

}
