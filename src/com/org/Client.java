package com.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	// Spring IOC
	
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeeBean.xml");
	Employee e1= (Employee)context.getBean("emp1");	
    System.out.println("Employee Details"+ e1);
	
   
	}
}
