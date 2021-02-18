package main.pr2;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.*;


import static jdk.vm.ci.sparc.SPARC.o2;


public class HumanSort implements Comparable<Human>{
    private static void testSorted() {


        ListOfHuman H = new ListOfHuman();
        List<Human> a = H.getListOfHumans();
        Comparator<ListOfHuman> byW = (o1,o2) ->o1.getWeight().compareTo(o2.getWeight());
        List<ListOfHuman> byReverseWeight = (List<ListOfHuman>) a.stream().sorted(byW.reversed());


        Collection<ListOfHuman> byWe = a.stream().sorted((o1,o2) ->-o1.getWeight().compareTo(o2.getWeight())).collect(Collectors.toList());
    }

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human people = (Human) o;
        Object age = people.getAge();
        Object fname = people.getFirstName();
        Object lname = people.getLastName();
        Object bd = people.getBD();
        Object weight = people.getWeight();
        return Objects.equals(age, people.getAge()) &&
                Objects.equals(fname, people.getFirstName()) &&
                Objects.equals(lname, people.getLastName()) &&
                Objects.equals(bd, people.getbirthDate())&&
                Objects.equals(weight, people.getWeight());
    }

    @Override
    public int compareTo(ListOfHuman another) {
        int enabledComparison = Boolean.compare(isEnabled(), another.isEnabled());

        if (enabledComparison != 0) {
            return enabledComparison;
        }

        return Integer.compare(getPriority(), another.getPriority());
    }
}