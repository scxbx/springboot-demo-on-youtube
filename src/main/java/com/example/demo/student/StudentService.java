package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "scxbx",
                "scxbx@gmail.com",
                LocalDate.of(1997, Month.MARCH, 13),
                22
        ));
    }
}
