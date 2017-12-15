package design.pattern.创建型模式CreationalPatterns.抽象工厂模式AbstractFactoryPattern;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("绿色fill()方法");
    }
}