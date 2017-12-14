package design.pattern.J2EE设计模式.服务定位器模式ServiceLocatorPattern;

public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}