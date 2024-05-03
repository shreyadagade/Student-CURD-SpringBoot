package com.student.studentcurdspringboot.dao;

import com.student.studentcurdspringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
