package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 * 冷饮饮料
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}