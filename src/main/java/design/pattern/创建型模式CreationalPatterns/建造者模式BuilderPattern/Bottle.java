package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}