package com.example.demo.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path= "api/v1/student")

public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        return List.of(

                new Student(
                        1l,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2020, Month.JANUARY,5),
                        26
                )


        );
    }



}
