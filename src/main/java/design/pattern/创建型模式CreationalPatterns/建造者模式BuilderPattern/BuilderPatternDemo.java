package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
//        MealBuilder mealBuilder = new MealBuilder();
        MealBuilder mealBuilder = MealBuilder.newInstance();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜餐");
        vegMeal.showItems();
        System.out.println("总餐费: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n非蔬菜餐");
        nonVegMeal.showItems();
        System.out.println("总餐费: " +nonVegMeal.getCost());
    }
}