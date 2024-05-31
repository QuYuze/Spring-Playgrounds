package com.yuze.springboot.playground_REST_CRUD_APIs.restController;

import com.yuze.springboot.playground_REST_CRUD_APIs.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentController {
    List<Student> studentList;

    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<>();
        studentList.add(new Student("Yuze", "Qu"));
        studentList.add(new Student("Ke", "Li"));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentList;
    }

    // define endpoints for /students/{studentID} - return student at index
    //parameters name need to match the api parameter
    @GetMapping("/students/{studentID}")
    public Student getAllStudentsAtIndex(@PathVariable int studentID){
        return studentList.get(studentID);
    }
}
