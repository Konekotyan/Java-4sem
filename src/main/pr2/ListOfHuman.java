package main.pr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListOfHuman {

    Human human;
    private List<Human> listOfHumans = new ArrayList<Human>();
    Scanner console = new Scanner(System.in);
    public ListOfHuman() {
        System.out.println("Сколько человек вы хотите занести в список?");
        int n = console.nextInt();
        for (int i = 0; i<n; i++){addHuman();}
    }
    private void addHuman(){
        Human human = new Human();
        human.setAge();
        human.setFirstName();
        human.setLastName();
        human.setbirthDate();
        human.setWeight();
        listOfHumans.add(human);
    }

    public List<Human> getListOfHumans(){
        return listOfHumans;
    }

}
