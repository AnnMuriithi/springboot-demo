package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

            Student ann =new Student(
                    "Ann",
                    "annmuriithi105@gmail.com",
                    LocalDate.of(1997, Month.DECEMBER,28)


            );
            Student jane =new Student(
                    "Jane",
                    "jane@gmail.com",
                    LocalDate.of(1992, Month.JULY,05)


            );
            repository.saveAll(
                    List.of(ann,jane)
            );
        };
    }
}
