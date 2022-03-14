package streams;
import java.util.*;
import java.util.stream.Collectors;

public class q1 {
	private String name;
    private int calories;
    private int price;
    private String color;

    public void Fruit(String name, int calories, int price, String color) {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

public class q1 {

    public static List<String> reverseSort(ArrayList<q1> fruits) {
        //System.out.println(fruits);
        ArrayList<q1> fruitName = fruits.stream()
                .filter(p -> p.getCalories() < 100)
                .sorted(Comparator.comparingInt(q1::getCalories).reversed())
                .collect(Collectors.toCollection(ArrayList::new));

       ArrayList<String> fruitName1 = new ArrayList<>();
       for(q1 fruit:fruitName){
           fruitName1.add(fruit.getName());
       }
        System.out.println(fruitName1);
        return fruitName1;
    }

    public static ArrayList<q1> sort(ArrayList<q1> Fruits) {
        Fruits=Fruits.stream()
                .sorted(Comparator.comparing(q1::getColor))
                .collect(Collectors.toCollection(ArrayList::new));
        return Fruits;
    }

    public static ArrayList<q1> filterRedSortPrice(ArrayList<q1> fruits){
        fruits=fruits.stream()
                .filter(p->p.getColor().equals("Red"))
                .sorted(Comparator.comparingInt(q1::getPrice))
                .collect(Collectors.toCollection(ArrayList::new));
        return fruits;
    }

    public static void main(String[] args) {
        ArrayList<q1>fruits = new ArrayList<>();
        fruits.add( new q1("Watermelon",120,50,"Yellow"));
        fruits.add(new q1("Apple",80,80,"Red"));
        fruits.add(new q1("Banana",110,40,"Yellow"));
        fruits.add( new q1("Pear",100,30,"Yellow"));
        fruits.add(new q1("Grapes",60,50,"Green"));
        reverseSort( fruits);
        sort(fruits);
        filterRedSortPrice(fruits);

    }
}
