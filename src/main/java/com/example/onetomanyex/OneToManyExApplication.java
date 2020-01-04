package com.example.onetomanyex;

import com.example.onetomanyex.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToManyExApplication {

    private final IDatabase iDatabase;

    public OneToManyExApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(OneToManyExApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return args -> {
            iDatabase.createDatabase();
        };
    }
}
