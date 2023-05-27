package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // to make sure this class should be instantiated before being used
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
