package com.yuze.springboot.plaground_Hibernate_JPA_CRUD;

import com.yuze.springboot.plaground_Hibernate_JPA_CRUD.dao.StudentDAO;
import com.yuze.springboot.plaground_Hibernate_JPA_CRUD.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


/*

JPA dev process:
1. annotate java class
2. develop java code to perform database operations

In Spring boot, hibernate is the default of JPA

Minimum for data entities:
1. @Entity
2. at least one public or protected no-arg constructor

CRUD
1.create
2.read
3.update
4.delete

DAO
Data Access Object, such as Student()
1. define DAO interface
2. define DAO implementations, inject the entity manager
3. update main app

Retrieving Obj
1. add new method to dao
2. define the implementation
3. update the main app


 */
@SpringBootApplication
public class PlaygroundHibernateJpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundHibernateJpaCrudApplication.class, args);
	}

	//Inject StudentDao
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudent(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			queryByStudentLastName(studentDAO);

		};
	}

	private void queryByStudentLastName(StudentDAO studentDAO) {
		//get list of student
		List<Student> list = studentDAO.findByLastName("qu");

		//display the list if the students
		list.forEach((student -> System.out.println(student.toString())));
	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get a list of students
		List<Student> list = studentDAO.findAll();

		//display list of students
		list.forEach((student -> System.out.println(student.toString())));
	}

	private void readStudent(StudentDAO studentDAO) {
		//create student
		System.out.println("Creating new student obj...");
		Student tempStudent = new Student("yuze", "qu", "yzq@gmail.com");

		//save student
		System.out.println("Saving Student obj...");
		studentDAO.save(tempStudent);

		//display id of the save student
		int id = tempStudent.getId();
		System.out.println("Saved student generated id: " + id);

		//retrieve student using id
		System.out.println("Retrieving student using id...");
		Student myStudent = studentDAO.findByID(id);

		//display student
		System.out.println("Retrieved studen: " +  myStudent.toString());


	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//create multiple student
		System.out.println("Creating new student obj...");
		Student tempStudent1 = new Student("ke", "lee", "ke.li@gmail.com");
		Student tempStudent2 = new Student("yuze", "qu", "yzq@gmail.com");


		//save teh students
		System.out.println("Saving Student obj...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
	}

	private void createStudent(StudentDAO studentDAO) {
		//create student obj
		System.out.println("Creating new student obj...");
		Student tempStudent = new Student("yuze", "qu", "yzq@gmail.com");

		//save student obj
		System.out.println("Saving Student obj...");
		studentDAO.save(tempStudent);

		// disaplay the id of the save student obj
		System.out.println("Saved student generated id: " + tempStudent.getId());
	}
}
