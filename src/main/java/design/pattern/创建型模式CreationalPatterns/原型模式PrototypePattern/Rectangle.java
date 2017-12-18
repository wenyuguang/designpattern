package design.pattern.创建型模式CreationalPatterns.原型模式PrototypePattern;

/**
 * 长方形
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "长方形";
    }

    @Override
    public void draw() {
        System.out.println("长方形draw()方法");
    }
}