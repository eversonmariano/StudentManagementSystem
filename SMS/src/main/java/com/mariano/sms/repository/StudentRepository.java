package com.mariano.sms.repository;

import com.mariano.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {



}
