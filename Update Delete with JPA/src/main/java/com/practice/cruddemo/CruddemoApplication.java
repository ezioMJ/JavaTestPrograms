package com.practice.cruddemo;

import java.util.List;

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
			//  readStudent(studentDAO);
			//queryForStudents(studentDAO);
			 //updateStudent(studentDAO);
			 removeStudent(studentDAO);
								};
							}

			private void queryForStudents(StudentDAO studentDAO){
				List<Student> theStudent = studentDAO.findAll();
				for(Student tempStudent : theStudent){
					System.out.println(tempStudent);
				}
			}

			private void removeStudent(StudentDAO studentDAO){
				int studentID = 2;
				System.out.println("Deleting the student with ID : " + studentID);
				studentDAO.delete(studentID);
				System.out.println("Deleted");
			}

			private void updateStudent(StudentDAO studentDAO){
				int studentID = 1;
				System.out.println("Getting student with ID : " + studentID);
				Student myStudent = studentDAO.findById(studentID);

				//change the first name
				System.out.println("Updating the student");
				myStudent.setFirstName("Ezio");

				//update
				studentDAO.update(myStudent);

				System.out.println("Updated...");

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
