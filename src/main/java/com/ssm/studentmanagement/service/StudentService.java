package com.ssm.studentmanagement.service;

import com.ssm.studentmanagement.dto.StudentDto;
import com.ssm.studentmanagement.entities.StudentEntity;
import com.ssm.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentDto addStudent(StudentDto studentDto) {
        System.out.println("adding student: " + studentDto);
        StudentEntity studentEntity = StudentEntity.builder()
                .id(studentDto.getStdId())
                .age(studentDto.getAge())
                .email(studentDto.getEmail())
                .name(studentDto.getName())
                .build();
        studentRepository.save(studentEntity);
        return studentDto;
    }
}
