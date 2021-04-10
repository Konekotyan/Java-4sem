package main.pr10.configs;

import main.pr10.mastery.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public Junior getJ() {return new Junior();}

    @Bean("middle")
    public Middle getM() {return new Middle();}

    @Bean("senior")
    public Senior getS() {return new Senior();}
}
