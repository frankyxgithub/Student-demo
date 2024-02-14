package com.efe.Studentdemo.service;

import com.efe.Studentdemo.model.Student;

import java.util.List;

public interface StudentServiceImpl {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);

}
