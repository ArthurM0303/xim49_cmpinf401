package xim49_MenuManager;

import java.util.ArrayList;

import java.util.*;

import java.util.List;

import java.util.Map;

import java.util.Random;

public class MenuManager {

private ArrayList<Entree> entree;

private ArrayList<Side> sides;

private ArrayList<Salad> salads;

private ArrayList<Dessert> desserts;

public ArrayList<Entree> getEntree() {

return entree;

}

public void setEntree(ArrayList<Entree> entree) {

this.entree = entree;

}

public ArrayList<Side> getSides() {

return sides;

}

public void setSides(ArrayList<Side> sides) {

this.sides = sides;

}

public ArrayList<Salad> getSalads() {

return salads;

}

public void setSalads(ArrayList<Salad> salads) {

this.salads = salads;

}

public ArrayList<Dessert> getDesserts() {

return desserts;

}

public void setDesserts(ArrayList<Dessert> desserts) {

this.desserts = desserts;

}

public MenuManager(String dishesFile){

Map<Integer,List> all = FileManager.readItems("fileName.txt");

entree = (ArrayList<Entree>) all.get(1);

sides = (ArrayList<Side>) all.get(2);

salads = (ArrayList<Salad>) all.get(3);

desserts = (ArrayList<Dessert>) all.get(4);

}

public Menu randomMenu(String name)

{

Random rand = new Random();

int randEntree = rand.nextInt(entree.size());

Entree randomEntree = entree.get(randEntree);

int randSide = rand.nextInt(sides.size());

Side randomSide = sides.get(randSide);

int randSalad = rand.nextInt(salads.size());

Salad randomSalad = salads.get(randSalad);

int randDessert = rand.nextInt(desserts.size());

Dessert randomDessert = desserts.get(randDessert);

return new Menu(randomEntree, randomSide, randomSalad, randomDessert);

}

public Menu minCaloriesMenu(String name){

ArrayList<Entree> e1 = entree;

// sort the arralists as cal ascending order

Collections.sort(e1, new Comparator<Entree>() {

@Override

public int compare(Entree c1, Entree c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Entree randomEntree = e1.get(0); // getting min caleries object

ArrayList<Side> s1 = sides;

Collections.sort(s1, new Comparator<Side>() {

@Override

public int compare(Side c1, Side c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Side randomSide = s1.get(0);

ArrayList<Salad> sal = salads;

Collections.sort(sal, new Comparator<Salad>() {

@Override

public int compare(Salad c1, Salad c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Salad randomSalad = sal.get(0);

ArrayList<Dessert> d1 = desserts;

Collections.sort(d1, new Comparator<Dessert>() {

@Override

public int compare(Dessert c1, Dessert c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Dessert randomDessert = d1.get(0);

return new Menu(randomEntree, randomSide, randomSalad, randomDessert);

}

public Menu maxCaloriesMenu(String name){

ArrayList<Entree> e1 = entree;

// sort the arraylist in ascending order

Collections.sort(e1, new Comparator<Entree>() {

@Override

public int compare(Entree c1, Entree c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Entree randomEntree = e1.get(e1.size()-1); // getting max cal object

ArrayList<Side> s1 = sides;

Collections.sort(s1, new Comparator<Side>() {

@Override

public int compare(Side c1, Side c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Side randomSide = s1.get(s1.size()-1);

ArrayList<Salad> sal = salads;

Collections.sort(sal, new Comparator<Salad>() {

@Override

public int compare(Salad c1, Salad c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Salad randomSalad = sal.get(sal.size()-1);

ArrayList<Dessert> d1 = desserts;

Collections.sort(d1, new Comparator<Dessert>() {

@Override

public int compare(Dessert c1, Dessert c2) {

return Integer.compare(c1.getCalories(), c2.getCalories());

}

});

Dessert randomDessert = d1.get(d1.size()-1);

return new Menu(randomEntree, randomSide, randomSalad, randomDessert);

}

}