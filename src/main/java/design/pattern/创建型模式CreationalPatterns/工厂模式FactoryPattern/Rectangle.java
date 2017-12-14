package design.pattern.创建型模式CreationalPatterns.工厂模式FactoryPattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}