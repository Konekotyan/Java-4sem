package main.pr2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class HumanSort {
    public static void main(String[] args) {
        List<Human> listOfHumans = new ArrayList<>();

        listOfHumans.add(new Human(43, "Jasper", "Иванов", LocalDate.of(1978,3,11), 83));
        listOfHumans.add(new Human(38, "Kelley", "Сидоров", LocalDate.of(1983,12,16), 92));
        listOfHumans.add(new Human(14, "Christopher", "Петров", LocalDate.of(2007,8,22), 62));
        listOfHumans.add(new Human(22, "Lambert", "Оконцев", LocalDate.of(1999,1,15), 85));

        listOfHumans.stream().sorted(Comparator.comparing(Human::getWeight).reversed()).forEach(System.out::println);

        System.out.println();

        listOfHumans.stream().filter(human -> !human.getLastName().equals("Иванов")).forEach(System.out::println);

        System.out.println();

        listOfHumans.stream().sorted(Comparator.comparing(Human::getAge)).forEach(System.out::println);
        System.out.println();
        Stream<Human> humans = listOfHumans.stream();
        int sum = 1;
        sum *= humans.mapToInt(Human::getAge).reduce(1,(a, b) -> a*b);

        System.out.println(sum);
    }
}