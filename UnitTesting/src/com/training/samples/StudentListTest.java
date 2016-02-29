package com.training.samples;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		HashSet<Student> studs = new HashSet<Student>();
		studs.add(new Student(101, "Sumit"));
		studs.add(new Student(101, "Sumit2"));
		
		StudentList list = new StudentList(studs);
		
		int actual = list.getStud().size();
		
		assertEquals(2, actual);
		
	}

}
