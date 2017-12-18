package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 *瓶装
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "瓶装";
    }
}