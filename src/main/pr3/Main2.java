package main.pr3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class Main2 {
    static HashSet<Integer> hs = new HashSet<>();
    static Iterator iterator = hs.iterator();
    synchronized static void go(int i){
        hs.add(i);
    }
    public static void main(String[] args) throws InterruptedException {

        Thread one = new Thread(() -> {
            for (int i=0;i<=6;i++) go(i);
        });
        Thread two = new Thread(() -> {
            for (int i=0;i<=10;i++) go(i);
        });

        one.start();
        two.start();

        Stream stream = hs.stream();
        stream.forEach(System.out::println);

    }
}