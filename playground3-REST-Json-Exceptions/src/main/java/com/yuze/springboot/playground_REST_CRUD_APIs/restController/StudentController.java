package com.yuze.springboot.playground_REST_CRUD_APIs.restController;

import com.yuze.springboot.playground_REST_CRUD_APIs.entity.Student;
import com.yuze.springboot.playground_REST_CRUD_APIs.entity.StudentErrorResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if(studentID >= studentList.size() || studentID < 0){
            throw new StudentNotFoundException("Student id not found: " + studentID);
        }
        return studentList.get(studentID);
    }
}
