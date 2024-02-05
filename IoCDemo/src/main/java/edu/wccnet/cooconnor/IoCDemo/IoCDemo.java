package edu.wccnet.cooconnor.IoCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IoCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating spring container
		ApplicationContext context = new FileSystemXmlApplicationContext("beanConfig.xml");
		//get beans from container
		IBird bird = (IBird)context.getBean("bird");
		System.out.println(bird.getEatingHabit());
		((FileSystemXmlApplicationContext)context).close();
	}

}
