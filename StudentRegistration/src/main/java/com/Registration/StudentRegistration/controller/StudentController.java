package com.Registration.StudentRegistration.controller;
import com.Registration.StudentRegistration.model.Student;
import com.Registration.StudentRegistration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/Add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student is added";
    }
    @GetMapping("/GetAll")
    public List<Student>getAllStudents(){
        return  studentService.getAllStudents();
    }
}
