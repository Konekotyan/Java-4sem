package main.pr8.Iterator;

import main.pr8.Iterator.Iterator;
import main.pr8.Iterator.Numbers;

public class Iterator_ {//тест
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Iterator iterator = numbers.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}