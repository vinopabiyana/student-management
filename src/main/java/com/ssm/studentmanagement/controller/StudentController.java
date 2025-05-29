package com.ssm.studentmanagement.controller;


import com.ssm.studentmanagement.dto.StudentDto;
import com.ssm.studentmanagement.entities.StudentEntity;
import com.ssm.studentmanagement.repository.StudentRepository;
import com.ssm.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/student/add")
    public StudentDto addStudent(@RequestBody StudentDto studentDto) {
        return studentService.addStudent(studentDto);
    }
    @GetMapping("/student/get")
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }
}