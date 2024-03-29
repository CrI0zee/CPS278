package edu.wccnet.cooconnor.DIDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("edu.wccnet.cooconnor.DIDemo")
public class DIDemoJavaConfig {

	
	@Bean
	public College wcc() {
		College myCollege = new College();
		myCollege.setCollegeService(communityCollegeService());
		return myCollege;
	}
	
	@Bean
	public CommunityCollegeService communityCollegeService() {
		return new CommunityCollegeService();
	}
	
	@Bean 
	public Finaid finaid() {
		
		return new Finaid(wcc(), scholarships());
	}
	
	@Bean
	public Scholarships scholarships() {
		return new Scholarships();
	}
}
