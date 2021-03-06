package design.pattern.行为型模式BehavioralPatterns.访问者模式VisitorPattern;

public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}