package ru.mirea.pr13;


import lombok.extern.log4j.Log4j2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.logging.Logger;

@Log4j2
@SpringBootApplication
public class Pr13Application {

    private static final Logger log = Logger .getGlobal();
    public static void main(String[] args) {
        SpringApplication.run(Pr13Application.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(Environment environment){
        return args -> {
            log.info(environment.getProperty("program.student.name") + " " +
                    environment.getProperty("program.student.last_name") + " " +
                    environment.getProperty("program.student.group"));
        };
    }
}
