package main.pr10;

import main.pr10.mastery.Junior;
import main.pr10.mastery.Middle;
import main.pr10.mastery.Senior;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("main.pr10");
        Junior junior = context.getBean(Junior.class);
        Middle middle = (Middle) context.getBean("middle");
        Senior senior = context.getBean("senior", Senior.class);

        junior.doCoding();
        middle.doCoding();
        senior.doCoding();
    }
}
