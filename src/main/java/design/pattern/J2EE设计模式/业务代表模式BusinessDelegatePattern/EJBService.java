package design.pattern.J2EE设计模式.业务代表模式BusinessDelegatePattern;

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
