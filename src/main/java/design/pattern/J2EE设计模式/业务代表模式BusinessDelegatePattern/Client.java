package design.pattern.J2EE设计模式.业务代表模式BusinessDelegatePattern;

public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}