package design.pattern.J2EE设计模式.拦截过滤器模式InterceptingFilterPattern;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}