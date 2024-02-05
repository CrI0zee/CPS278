package edu.wccnet.cooconnor.DI_XML_Demo;

public class College {
	private String collegeName;
	private int yearBuilt;
	private String zipCode; 
	private int enrollment; 
	private CollegeService collegeService; 
	
	public College() {
		
	}
	
	public College(String collegeName, int yearBuilt) {
		this.collegeName = collegeName; 
		this.yearBuilt = yearBuilt; 
	}
	
	public void printCollegeService() {
		System.out.println(collegeService.getService(collegeName));
	}
	
	public String toString() {
		return "College [collegeName=" + collegeName + ", yearBuilt=" + yearBuilt + ", zipCode=" + zipCode + ", enrollment=" + enrollment + "]";
	}

	public String getCollegeName() {
		return collegeName; 
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setEnrollment(int enrollment) {
		this.enrollment = enrollment;
	}

	public void setCollegeService(CollegeService collegeService) {
		this.collegeService = collegeService;
	}
	
}
