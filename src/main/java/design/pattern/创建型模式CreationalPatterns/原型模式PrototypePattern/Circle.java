package design.pattern.创建型模式CreationalPatterns.原型模式PrototypePattern;

public class Circle extends Shape {

    public Circle(){
        type = "圆";
    }

    @Override
    public void draw() {
        System.out.println("圆draw()方法");
    }
}