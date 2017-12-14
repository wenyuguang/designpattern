package design.pattern.结构型模式StructuralPatterns.外观模式FacadePattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}