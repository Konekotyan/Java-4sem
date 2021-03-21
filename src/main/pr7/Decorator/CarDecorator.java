package main.pr7.Decorator;

import main.pr7.Decorator.Car1;

abstract class CarDecorator implements Car1 {
    protected Car1 decorated;
    public CarDecorator(Car1 decorated){
        this.decorated = decorated;
    }
    public void draw(){
        decorated.draw();
    }
}
