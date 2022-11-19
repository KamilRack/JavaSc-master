package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static java.time.Month.MARCH;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student Marcin = new Student(
                   "Marcin",
                    "Marcin@gmail.com",
                    LocalDate.of(2000,MARCH,5)
            );
            Student Jan = new Student(
                    "Jan",
                    "jan.nowak@gmail.com",
                    LocalDate.of(2000,MARCH,5)
            );

            repository.saveAll(
                    List.of(Marcin,Jan)
                    );
        };
    }
}
