package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.model.Student;

public interface studentRepository extends CrudRepository<Student,Integer>{

}
