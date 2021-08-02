package com.seogyu.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "seogyu Kim",
                        "seogyugim@gmail.com",
                        LocalDate.of(2000, Month.FEBRUARY, 8),
                        20
                )
        );
    }
}
