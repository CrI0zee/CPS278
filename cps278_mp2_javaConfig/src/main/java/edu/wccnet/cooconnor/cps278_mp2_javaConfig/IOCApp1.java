package edu.wccnet.cooconnor.cps278_mp2_javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Character c1 = (Character)context.getBean("Sasuke");
		Character c2 = (Character)context.getBean("Naruto");
		Battle b1 = (Battle)context.getBean("Hyrule");
		Battle b2 = (Battle)context.getBean("Ammuud");
		b1.Fight();
		System.out.println("---End Of Scenario One---");
		b2.Fight();
		System.out.println("---End Of Scenario Two---");
		context.close();
	}

}
