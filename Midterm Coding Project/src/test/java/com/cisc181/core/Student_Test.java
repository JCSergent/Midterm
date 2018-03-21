package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course("Econ",100,eMajor.BUSINESS));
		courses.add(new Course("Java",100,eMajor.COMPSI));
		courses.add(new Course("Physics",100,eMajor.PHYSICS));
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		semesters.add(new Semester(new Date(8,20,2017), new Date(12,25,2017)));
		semesters.add(new Semester(new Date(2,5,2018), new Date(4,20,2018)));
		
		ArrayList<Section> sections = new ArrayList<Section>();
		for(Semester s : semesters) {
			for(Course c : courses) {
				sections.add(new Section(s.getSemsterID(), c.getCourseID(), 10));
			}
		}
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("James", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Hames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Games", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Lames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Fames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Wames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Mames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Tames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Cames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		students.add(new Student("Bames", "Sergent", "Carroll",new Date(10,20,1999), eMajor.COMPSI, "2513 Holly", "4104104100", "jcsergent20@udel.edu"));
		
		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for(Student s : students) {
			for(Section a : sections) {
				enrollments.add(new Enrollment(s.getStudentID(),a.getSectionID(), 80));
			}
		}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}