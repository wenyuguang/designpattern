package design.pattern.创建型模式CreationalPatterns.工厂模式FactoryPattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("调用了画圆方法draw()");
    }
}