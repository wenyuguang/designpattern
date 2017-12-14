package design.pattern.行为型模式BehavioralPatterns.责任链模式ChainofResponsibilityPattern;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}