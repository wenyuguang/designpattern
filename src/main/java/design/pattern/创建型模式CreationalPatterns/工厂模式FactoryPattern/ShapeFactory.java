package design.pattern.创建型模式CreationalPatterns.工厂模式FactoryPattern;

public class ShapeFactory {

    private static ShapeFactory shapeFactory;

    public static ShapeFactory newInstance(){
        synchronized (ShapeFactory.class){
            if(shapeFactory == null){
                shapeFactory = new ShapeFactory();
            }
        }

        return shapeFactory;
    }

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    //使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
    public static Object getClass(Class<? extends Shape> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }
}