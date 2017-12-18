package design.pattern.创建型模式CreationalPatterns.原型模式PrototypePattern;

/**
 * 正方形
 */
public class Square extends Shape {

    public Square() {
        type = "正方形";
    }

    @Override
    public void draw() {
        System.out.println("正方形draw()方法");
    }
}