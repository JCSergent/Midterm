package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID Enrollment;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SectionID, double Grade) {
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		Enrollment = UUID.randomUUID();
		this.setGrade(Grade);
	}
	
	public void setGrade(double grade) {
		this.Grade = grade;
	}
	
	public double getGrade() {
		return Grade;
	}
}
