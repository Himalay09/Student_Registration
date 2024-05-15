package com.Registration.StudentRegistration.service;
import com.Registration.StudentRegistration.model.Student;
import com.Registration.StudentRegistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
