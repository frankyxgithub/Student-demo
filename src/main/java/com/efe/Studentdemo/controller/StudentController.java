package com.efe.Studentdemo.controller;

import com.efe.Studentdemo.model.Student;
import com.efe.Studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.addStudent(student));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.FOUND);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Long id){
        return ResponseEntity.ok(studentService.updateStudent(student, id));
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

//    @GetMapping("/student/{id}")
//    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
//        return ResponseEntity.ok(studentService.getStudentById(id));
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        studentService.deleteStudent(id);
    }



}
