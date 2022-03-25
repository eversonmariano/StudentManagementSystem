package com.mariano.sms;

import com.mariano.sms.entity.Student;
import com.mariano.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		Student student1 = new Student("Everson", "Mariano", "everson@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("Ramesh", "Fadatare", "ramesh@hotmail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Sanjay", "Jadhav", "sanjay@yahoo.com");
		studentRepository.save(student3);
		*/
	}
}
