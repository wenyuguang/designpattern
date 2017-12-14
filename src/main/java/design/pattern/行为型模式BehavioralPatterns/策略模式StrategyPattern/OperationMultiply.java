package design.pattern.行为型模式BehavioralPatterns.策略模式StrategyPattern;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
