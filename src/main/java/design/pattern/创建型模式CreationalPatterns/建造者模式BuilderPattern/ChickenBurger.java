package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }
}