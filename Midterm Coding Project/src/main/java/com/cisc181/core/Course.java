package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(String CourseName, int GradePoints, eMajor Major) {
		this.CourseID = UUID.randomUUID();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public eMajor getMajor() {
		return Major;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	
	public void setMajor(eMajor Major) {
		this.Major = Major;
	}
	
	public void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}
	
	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}
	
	public void setGradePoints(int GradePoints) {
		this.GradePoints = GradePoints;
	}
}
