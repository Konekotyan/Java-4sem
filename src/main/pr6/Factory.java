package main.pr6;

public class Factory {
    public interface Shape
    {
        void draw();
    }
    public static class Rectangle implements Shape
    {
        @Override public void draw()
        {
            System.out.println("Rectangle::draw() method.");
        }
    }
    public static class Square implements Shape
    {
        @Override public void draw()
        {
            System.out.println("Square::draw() method.");
        }
    }
    public static class Circle implements Shape
    {
        @Override public void draw()
        {
            System.out.println("Circle::draw() method.");
        }
    }
    public static class ShapeFactory
    {
        //use getShape method to get object of type shape
        public Shape getShape(String shapeType)
        {
            if(shapeType == null)
            {
                return null;
            }
            if(shapeType.equalsIgnoreCase("CIRCLE"))
            {
                return new Circle();
            }
            else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            {
                return new Rectangle();
            }
            else if(shapeType.equalsIgnoreCase("SQUARE"))
            {
                return new Square();
            }
            return null;
        }
    }
    public static void main(String[] args)
        {
            ShapeFactory shapeFactory = new ShapeFactory();
//get an object of Circle and call its draw method.
            Shape shape1 = shapeFactory.getShape("CIRCLE");
            shape1.draw();
//get an object of Rectangle and call its draw method.
            Shape shape2 = shapeFactory.getShape("RECTANGLE");
//call draw method of Rectangle
            shape2.draw();
//get an object of Square and call its draw method.
            Shape shape3 = shapeFactory.getShape("SQUARE");
//call draw method of square
            shape3.draw();
        }
    }

