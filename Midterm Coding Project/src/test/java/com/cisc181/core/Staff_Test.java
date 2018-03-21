package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {

		ArrayList<Staff> staff = new ArrayList<Staff>();
		staff.add(new Staff("James", "Carroll", "Sergent", new Date(10,20,1999), "2134 Holly Springs", "9180381923", "hey@gmail.com", "9:00-10:00", 4, 150.0, new Date(10,10,2017), eTitle.MR));
		staff.add(new Staff("James", "Carroll", "Sergent", new Date(10,20,1999), "2134 Holly Springs", "9180381923", "hey@gmail.com", "9:00-10:00", 4, 200.0, new Date(10,10,2017), eTitle.MR));
		staff.add(new Staff("James", "Carroll", "Sergent", new Date(10,20,1999), "2134 Holly Springs", "9180381923", "hey@gmail.com", "9:00-10:00", 4, 100.0, new Date(10,10,2017), eTitle.MR));
		staff.add(new Staff("James", "Carroll", "Sergent", new Date(10,20,1999), "2134 Holly Springs", "9180381923", "hey@gmail.com", "9:00-10:00", 4, 150.0, new Date(10,10,2017), eTitle.MR));
		staff.add(new Staff("James", "Carroll", "Sergent", new Date(10,20,1999), "2134 Holly Springs", "9180381923", "hey@gmail.com", "9:00-10:00", 4, 100.0, new Date(10,10,2017), eTitle.MR));
		double totalSalary=0;
		for(Staff staf : staff ) {
			totalSalary += staf.getSalary();
		}
		double average = totalSalary/5;
		System.out.print(average);
		assertEquals(average,140.0,0);
	}
	
	@Test
	public void test2() {
		Staff person = new Staff("James", "Carroll", "Sergent", new Date(10,20,1999), "2134 Holly Springs", "9180381923", "hey@gmail.com", "9:00-10:00", 4, 150.0, new Date(10,10,2017), eTitle.MR);
	}

}
