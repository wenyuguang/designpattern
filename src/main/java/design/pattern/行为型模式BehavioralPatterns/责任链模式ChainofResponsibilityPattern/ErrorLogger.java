package design.pattern.行为型模式BehavioralPatterns.责任链模式ChainofResponsibilityPattern;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}