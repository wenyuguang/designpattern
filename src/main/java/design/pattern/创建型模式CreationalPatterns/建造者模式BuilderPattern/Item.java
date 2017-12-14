package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}