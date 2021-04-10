package main.pr10.mastery;

import main.pr10.Programmer;

public class Senior implements Programmer {
    private String mastery = "Senior";

    @Override
    public void doCoding() {
        System.out.println(mastery);
    }
}
