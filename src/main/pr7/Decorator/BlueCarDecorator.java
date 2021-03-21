package main.pr7.Decorator;

import main.pr7.Decorator.Car1;

class BlueCarDecorator extends CarDecorator {
    public BlueCarDecorator(Car1 decorated) {
        super(decorated);
    }
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: red");
    }
}
