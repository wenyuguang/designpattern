package design.pattern.行为型模式BehavioralPatterns.责任链模式ChainofResponsibilityPattern;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}