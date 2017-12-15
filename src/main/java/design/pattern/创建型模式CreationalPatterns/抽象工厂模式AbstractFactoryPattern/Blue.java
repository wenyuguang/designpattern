package design.pattern.创建型模式CreationalPatterns.抽象工厂模式AbstractFactoryPattern;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("蓝色fill()方法");
    }
}