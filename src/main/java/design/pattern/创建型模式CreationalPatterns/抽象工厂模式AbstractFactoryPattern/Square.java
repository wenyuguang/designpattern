package design.pattern.创建型模式CreationalPatterns.抽象工厂模式AbstractFactoryPattern;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("正方形draw()方法");
    }
}