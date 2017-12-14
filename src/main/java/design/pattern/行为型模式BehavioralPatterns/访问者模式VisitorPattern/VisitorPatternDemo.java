package design.pattern.行为型模式BehavioralPatterns.访问者模式VisitorPattern;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}