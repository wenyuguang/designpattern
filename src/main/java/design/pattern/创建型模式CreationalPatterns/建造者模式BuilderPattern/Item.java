package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 *  产品
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}