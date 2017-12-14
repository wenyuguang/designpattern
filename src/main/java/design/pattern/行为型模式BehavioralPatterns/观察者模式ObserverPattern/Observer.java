package design.pattern.行为型模式BehavioralPatterns.观察者模式ObserverPattern;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}