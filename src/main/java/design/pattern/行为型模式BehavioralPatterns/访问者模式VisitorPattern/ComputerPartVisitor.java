package design.pattern.行为型模式BehavioralPatterns.访问者模式VisitorPattern;

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}