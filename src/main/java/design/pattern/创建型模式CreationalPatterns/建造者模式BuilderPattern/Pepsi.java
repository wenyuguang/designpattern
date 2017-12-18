package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 * 百事
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "百事";
    }
}