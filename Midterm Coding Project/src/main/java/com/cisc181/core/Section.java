package com.cisc181.core;

import java.util.UUID;

public class Section{
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID SemesterID, UUID CourseID, int RoomID) {
		this.SectionID = UUID.randomUUID();
		this.RoomID = RoomID;
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	
	public void setCourseID(UUID CourseID) {
		this.CourseID = CourseID;
	}
	
	public void setSemesterID(UUID SemesterID) {
		this.SemesterID = SemesterID;
	}
	
	public void setSectionID(UUID SectionID) {
		this.SectionID = SectionID;
	}
	
	public void setRoomID(int RoomID) {
		this.RoomID = RoomID;
	}
}
