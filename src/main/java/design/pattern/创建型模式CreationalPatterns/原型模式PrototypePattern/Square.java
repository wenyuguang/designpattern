package design.pattern.创建型模式CreationalPatterns.原型模式PrototypePattern;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}