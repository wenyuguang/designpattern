package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}