package design.pattern.结构型模式StructuralPatterns.外观模式FacadePattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}