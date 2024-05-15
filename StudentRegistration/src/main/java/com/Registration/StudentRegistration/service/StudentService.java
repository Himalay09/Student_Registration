package com.Registration.StudentRegistration.service;

import com.Registration.StudentRegistration.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
