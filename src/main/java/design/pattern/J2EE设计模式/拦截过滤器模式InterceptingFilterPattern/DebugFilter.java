package design.pattern.J2EE设计模式.拦截过滤器模式InterceptingFilterPattern;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}