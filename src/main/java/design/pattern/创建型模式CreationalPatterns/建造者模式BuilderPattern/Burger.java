package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 * 汉堡 抽象类
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}