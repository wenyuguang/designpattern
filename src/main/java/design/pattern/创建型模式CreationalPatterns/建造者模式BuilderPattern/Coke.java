package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "可乐";
    }
}