package design.pattern.创建型模式CreationalPatterns.原型模式PrototypePattern;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}