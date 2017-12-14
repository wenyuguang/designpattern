package design.pattern.行为型模式BehavioralPatterns.备忘录模式MementoPattern;

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}