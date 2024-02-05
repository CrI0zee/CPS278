package edu.wccnet.cooconnor.IoCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IoCDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("beanConfig2.xml");
		//get beans from container
		IBird bird = (IBird)context.getBean("bird");
		System.out.println(bird.getEatingHabit());
		((ClassPathXmlApplicationContext)context).close();
	}

}
