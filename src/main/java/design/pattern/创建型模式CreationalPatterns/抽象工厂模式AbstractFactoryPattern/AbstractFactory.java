package design.pattern.创建型模式CreationalPatterns.抽象工厂模式AbstractFactoryPattern;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

    Object getClass(Class<? extends Object> className) {
        Object obj = null;
        try{
            Class<?> clz = Class.forName(className.getName());
            obj = clz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}