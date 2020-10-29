package com.spring.springorm;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springorm/config.xml");
		StudentDao stdao = context.getBean("studentDao", StudentDao.class);
		Student s = new Student(2, "rahul", "noida");
		Student s2 = new Student(3, "raj", "noida");
		// int result = stdao.insert(s);
		// stdao.insert(s2);
		// System.out.println("no of rows affected :" + result);

		// Student t = stdao.getStudent(2);
//		  System.out.println(t);
//		  s.setStudentName("qwerty"); 
//		  stdao.updateStudent(s);
//		  List<Student> allstudent
//		  = stdao.getAllStudent();
//		  System.out.println(allstudent);
		// stdao.deleteStudent(t);

	}
}
