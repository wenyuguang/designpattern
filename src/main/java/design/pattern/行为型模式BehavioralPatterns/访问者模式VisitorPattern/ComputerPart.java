package design.pattern.行为型模式BehavioralPatterns.访问者模式VisitorPattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}