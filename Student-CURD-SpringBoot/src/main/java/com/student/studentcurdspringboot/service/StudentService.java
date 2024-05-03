package com.student.studentcurdspringboot.service;

import com.student.studentcurdspringboot.dao.StudentRepository;
import com.student.studentcurdspringboot.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class StudentService {
    StudentRepository studentRepository;

    public List<Student> getAllStudent(){
       return studentRepository.findAll();
    }

    public Student getStudentById(int studentId){
        return studentRepository.findById(studentId).get();

    }

    public void addStudent(Student student){
        studentRepository.save(student);

    }

    public void updateStudent(Student student){
        studentRepository.save(student);


    }

    public void deleteStudent(int studentId){
        studentRepository.deleteById(studentId);
    }
}
