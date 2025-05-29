package com.ssm.studentmanagement.repository;

import com.ssm.studentmanagement.entities.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentEntity,String> {
}
