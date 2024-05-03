package com.student.studentcurdspringboot.controller;

import com.student.studentcurdspringboot.model.Student;
import com.student.studentcurdspringboot.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")

public class StudentController {
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable("studentId") int studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId){
        studentService.deleteStudent(studentId);
    }



}
