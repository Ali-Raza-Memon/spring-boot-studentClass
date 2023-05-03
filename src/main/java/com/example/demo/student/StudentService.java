package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

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
