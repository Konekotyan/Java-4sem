package main.pr2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Human extends ListOfHuman{
    Scanner console = new Scanner(System.in);
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;

    public Human() {
    }
    public Human(int age, String fname, String lname, LocalDate BD, int weight){

    }
    public void setAge() {
        System.out.print("Age: ");
        age = console.nextInt();
        if(age >= 0 && age < 120){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }
    public int getAge() {
        return age;
    }

    public void setFirstName (){
        System.out.print("First name: ");
        firstName = console.nextLine();
        this.firstName = firstName;
    }
    public String getFirstName (){return firstName;}

    public void  setLastName (){
        System.out.print("Last name: ");
        lastName = console.nextLine();
        this.lastName = lastName;
    }
    public String getLastName(){return lastName;}

    public void setbirthDate() {
        LocalDate dnow = LocalDate.of(1901, 1, 1);
        Date input = new Date();
        LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        birthDate = date;
        if(birthDate.isAfter(dnow) && birthDate.isBefore(LocalDate.now())) this.birthDate = birthDate;
        else System.out.println("Invalid birthDate");
    }
    public StringBuilder getbirthDate() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        String text = birthDate.format(formatDate);
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        return sb;
    }

    public void setWeight() {
        System.out.print("Weight: ");
        weight = console.nextInt();
        if(weight > 0 && weight < 300){
            this.weight = weight;
        }
        else{
            System.out.println("Invalid weight");
        }
    }
    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "The test subject:"+ '\n' +
                "Age: " + age + '\n' +
                "First name: " + firstName + '\n' +
                "Last name: " + lastName + '\n' +
                "Birth Date: " + birthDate + '\n' +
                "Weight: " + weight;
    }

}
