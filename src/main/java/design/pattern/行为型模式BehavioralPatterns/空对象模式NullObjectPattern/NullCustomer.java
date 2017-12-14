package design.pattern.行为型模式BehavioralPatterns.空对象模式NullObjectPattern;

public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}