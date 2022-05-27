package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public List<Student> student(){
        return List.of(
                new Student(
                        1, "Kevin", "hudgens1073@gmail.com",27
                )
        );
    }
}
