package main.pr2;

import java.util.ArrayList;
import java.util.List;


public class ListOfHuman {

    Human human;
    private List<Human> listOfHumans = new ArrayList<Human>();

    public ListOfHuman() {
        addHuman(new Human(human.setAge(), human.setFirstName(), human.setLastName(),human.setbirthDate(), human.setWeight()));
    }

    private void addHuman(Human human)
    {
        listOfHumans.add(human);
    }

    public List<Human> getListOfHumans(){
        return listOfHumans;
    }

}
