package com.ty.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.college.Student;
import com.ty.college.Teacher;

public class CollegeDriver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("my_conf1.xml");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("my_conf2.xml");
		
		Student student=(Student)context.getBean("myStudent");
		Teacher teacher=(Teacher)context1.getBean("myTeacher");
		
		student.write();
		teacher.teach();
	}
}
