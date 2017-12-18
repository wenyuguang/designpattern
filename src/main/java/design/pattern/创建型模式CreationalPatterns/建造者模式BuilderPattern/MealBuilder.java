package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

/**
 * 餐 建造
 */
public class MealBuilder {

    private static MealBuilder mealBuilder;

    public static MealBuilder newInstance(){
        synchronized (MealBuilder.class){
            if(mealBuilder == null){
                mealBuilder = new MealBuilder();
                return mealBuilder;
            }
        }
        return null;
    }

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}