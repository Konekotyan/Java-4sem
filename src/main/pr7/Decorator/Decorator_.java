package main.pr7.Decorator;

public class Decorator_ {//тест

    public static void main(String[] args) {
        Car1 sportCar = new SportCar();
        Car1 blueUnknownCar = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println();
        blueUnknownCar.draw();
    }
}
