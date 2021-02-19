package main.pr2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Human{

    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;

    public Human(int age, String fname, String lname, LocalDate BD, int weight){
        this.age = age;
        this.firstName = fname;
        this.lastName = lname;
        this.birthDate = BD;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    public String getFirstName (){return firstName;}

    public void  setLastName (String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){return lastName;}

    public void setbirthDate(LocalDate date) {
        this.birthDate = date;
    }
    public StringBuilder getbirthDate() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        String text = birthDate.format(formatDate);
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        return sb;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public Integer getWeight() {
        return weight;
    }



    @Override
    public String toString() {
        return "The test subject:"+ ", " +
                "Age: " + age + ", " +
                "First name: " + firstName + ", " +
                "Last name: " + lastName + ", " +
                "Birth Date: " + birthDate + ", " +
                "Weight: " + weight;
    }


}