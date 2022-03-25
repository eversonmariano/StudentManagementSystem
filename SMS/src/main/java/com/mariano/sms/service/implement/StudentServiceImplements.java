package com.mariano.sms.service.implement;

import com.mariano.sms.entity.Student;
import com.mariano.sms.repository.StudentRepository;
import com.mariano.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplements implements StudentService {

    private StudentRepository studentrepository;

    public StudentServiceImplements(StudentRepository studentrepository) {
        super();
        this.studentrepository = studentrepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentrepository.findAll();
    }

    @Override
    public Student saveStudent(Student student){
        return studentrepository.save(student);
    }
    @Override
    public Student getStudentById(Long id){
        return studentrepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentrepository.save(student);
    }

    public void deleteStudentById(Long id){
        studentrepository.deleteById(id);
    }



}
