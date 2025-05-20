package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			createMultipleStudents(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("creating new student...");
		Student temStudent = new Student("Paul","Doe","paul@gmail.com");
		System.out.println("Saving student...");
		studentDAO.save(temStudent);
		System.out.println("Saved Student "+temStudent.getId());

	}

	private void createMultipleStudents(StudentDAO studentDAO){
		System.out.println("creating 3 new student...");
		Student temStudent1 = new Student("Fifi","Dam","fifi@gmail.com");
		Student temStudent2 = new Student("Mario","Poe","Mario@gmail.com");
		Student temStudent3 = new Student("Ivan","Koe","Ivan@gmail.com");

		System.out.println("Saving 3 student...");
		studentDAO.save(temStudent1);
		studentDAO.save(temStudent2);
		studentDAO.save(temStudent3);
		System.out.println("Saved Student "+temStudent1.getId());
		System.out.println("Saved Student "+temStudent2.getId());
		System.out.println("Saved Student "+temStudent3.getId());
	}
}
