package main.pr10.mastery;


import main.pr10.Programmer;

public class Middle implements Programmer {
    private String mastery = "Middle";

    @Override
    public void doCoding() {
        System.out.println(mastery);
    }
}
