package edu.wccnet.cooconnor.DI_XML_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		College college = (College)context.getBean("wcc");
		System.out.println(college);
		college.printCollegeService();
		
		Finaid finaid = (Finaid)context.getBean("finaid");
		finaid.displayFinaid();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
