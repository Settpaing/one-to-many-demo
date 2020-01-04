package com.example.onetomanyex;

import com.example.onetomanyex.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyExApplication {


    public static void main(String[] args) {
        SpringApplication.run(OneToManyExApplication.class, args);
    }

    public CommandLineRunner runner(){
        return args -> {

        };
    }
}
