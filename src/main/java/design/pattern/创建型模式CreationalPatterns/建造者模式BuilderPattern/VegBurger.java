package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 * 蔬菜 汉堡
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "蔬菜汉堡";
    }
}