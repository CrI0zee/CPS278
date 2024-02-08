package edu.wccnet.cooconnor.DIDemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DIDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIDemoJavaConfig.class);
		College college = (College)context.getBean("wcc");
		System.out.println(college);
		college.printCollegeService();
		
		Finaid finaid = (Finaid)context.getBean("finaid");
		finaid.displayFinaid();
		
		context.close();
	}

}
