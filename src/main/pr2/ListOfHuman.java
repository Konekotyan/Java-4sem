package main.pr2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class ListOfHuman {

    Human human;
    private List<Human> listOfHumans = new ArrayList<Human>();
    Scanner console = new Scanner(System.in);
    public ListOfHuman() {
        /*System.out.println("Сколько человек вы хотите занести в список?");
        int n = console.nextInt();
        for (int i = 0; i<n; i++){addHuman();}*/
        addHuman(43, "Jasper", "Ross", LocalDate.ofEpochDay(1978-3-11), 83);
        addHuman(38, "Kelley", "Lloyd", LocalDate.ofEpochDay(1983-12-16), 92);
        addHuman(14, "Christopher", "Jones", LocalDate.ofEpochDay(2007-8-22), 62);
        addHuman(22, "Lambert", "Harris", LocalDate.ofEpochDay(1999-1-15), 85);
    }


    /*private void addHuman(){
        Human human = new Human();
        human.setAge();
        human.setFirstName();
        human.setLastName();
        human.setbirthDate();
        human.setWeight();
        listOfHumans.add(human);
    }*/
    private void addHuman(int age, String fname, String lname, LocalDate BD, int weight){
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

    public int getAge(){
        return human.getAge();
    }
    public String getfname(){
        return human.getfname();
    }
    public String getlname(){
        return human.getlname();
    }
    public LocalDate getBD(){
        return human.getBD();
    }
    public int getWeight(){
        return human.getWeight();
    }
}
