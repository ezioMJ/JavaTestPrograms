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
			//createStudent(studentDAO);
			  readStudent(studentDAO);
								};
							}
						
			private void readStudent(StudentDAO studentDAO){

				//Create the student object

				System.out.println("Creating the Student...");
				Student tempStudent = new Student("Vishal", "Revi", "revi2003@gmail.com");

				//Save the student object
				System.out.println("Saving the student...");
				studentDAO.save(tempStudent);

				//display the student id

				int id = tempStudent.getId();
				System.out.println("Saved Student ID : " + id);

				//retrieve the student based on id
				System.out.println("Retrieving the student");
				Student myStudent =studentDAO.findById(id);

				//display the student
				System.out.println("Student Details : " + myStudent);

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
