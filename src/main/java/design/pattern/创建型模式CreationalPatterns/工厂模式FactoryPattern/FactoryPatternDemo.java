package design.pattern.创建型模式CreationalPatterns.工厂模式FactoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        //使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
        Rectangle rect = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rect.draw();
        Square square = (Square) ShapeFactory.getClass(Square.class);
        square.draw();
    }
}
