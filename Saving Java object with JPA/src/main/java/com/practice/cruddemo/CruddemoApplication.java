package com.practice.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.practice.cruddemo.dao.StudentDAO;
import com.practice.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
					};
				}
			
		private void createStudent(StudentDAO studentDAO) {
			// Create the student object
			System.out.println("Creating the Student...");
			Student tempStudent = new Student("Vishvanth","MJ","vishvanthmj26@gmail.com");

			// Save the student
			System.out.println("Saving the student...");
			studentDAO.save(tempStudent);

			// Display the Student id
			System.out.println("Saved Student. ID : " + tempStudent.getId());
		}
}
