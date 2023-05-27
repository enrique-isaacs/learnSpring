package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){

        return List.of(
                new Student(
                        1L,
                        "enrique",
                        "enriqueIsABungo@gmail.com",
                        LocalDate.of(1999, Month.DECEMBER,21),
                        23
                )
        );

    }
}
