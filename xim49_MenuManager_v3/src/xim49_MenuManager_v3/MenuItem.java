package xim49_MenuManager_v3;

public class MenuItem {
private String name;
private String description;
private int calories;
private double price;

public MenuItem(String name, String description, int calories, double price) {
this.name = name;
this.description = description;
this.calories = calories;
this.price = price;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public int getCalories() {
return calories;
}

public void setCalories(int calories) {
this.calories = calories;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}

@Override
public String toString() {

return name;
}

public String getDetailedString() {
return "Name :"+name+",\n Description :"+description+",\n Calories :"+calories+",\n Price :"+price+"";
}

}


class Entree extends MenuItem {

public Entree(String name, String description, int calories, double price) {
super(name, description, calories, price);
}
}

class Side extends MenuItem {

public Side(String name, String description, int calories, double price) {
super(name, description, calories, price);
}

}

class Salad extends MenuItem {

public Salad(String name, String description, int calories, double price) {
super(name, description, calories, price);
}

}

class Dessert extends MenuItem {

public Dessert(String name, String description, int calories, double price) {
super(name, description, calories, price);
}

}