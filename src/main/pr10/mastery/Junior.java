package main.pr10.mastery;

import main.pr10.Programmer;

public class Junior implements Programmer {
    private String mastery = "Junior";

    @Override
    public void doCoding() {
        System.out.println(mastery);
    }
}
