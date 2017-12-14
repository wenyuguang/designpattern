package design.pattern.J2EE设计模式.服务定位器模式ServiceLocatorPattern;

public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}