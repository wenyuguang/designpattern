package design.pattern.创建型模式CreationalPatterns.建造者模式BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 餐
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("产品 : "+item.name());
            System.out.print(", 包装 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }
    }
}