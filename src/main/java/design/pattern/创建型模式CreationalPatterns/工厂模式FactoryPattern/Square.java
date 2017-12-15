package design.pattern.创建型模式CreationalPatterns.工厂模式FactoryPattern;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("调用了画正方形draw()");
    }
}