package com.mycompany.spring.requestJob.dao.impl;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mycompany.spring.requestJob.dao.ExampleDAO;

@Repository
public class ExampleDAOImpl implements ExampleDAO{
	
	public void getRequestJob() {
		System.out.println("ExampleDAOImpl Start");
	}
}
