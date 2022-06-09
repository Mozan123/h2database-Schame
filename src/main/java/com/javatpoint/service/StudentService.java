package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javatpoint.model.Student;
import com.javatpoint.repository.studentRepository;

public class StudentService {
	@Autowired  
	studentRepository StudentRepository; 
	
	//getting all student records  
	public List<Student> getAllStudent()   
	{  
	List<Student> students = new ArrayList<Student>();  
	StudentRepository.findAll().forEach(student -> students.add(student));  
	return students;  
	}  
	
	//getting a specific record  
	public Student getStudentById(int id)   
	{  
	return StudentRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Student student)   
	{  
	StudentRepository.save(student);  
	}  
	//deleting a specific record  
	public void delete(int id)   
	{  
	StudentRepository.deleteById(id);  
	}  
	
}
