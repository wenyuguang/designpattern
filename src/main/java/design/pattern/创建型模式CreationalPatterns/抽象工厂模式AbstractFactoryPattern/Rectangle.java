package design.pattern.创建型模式CreationalPatterns.抽象工厂模式AbstractFactoryPattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("长方形draw()方法");
    }
}