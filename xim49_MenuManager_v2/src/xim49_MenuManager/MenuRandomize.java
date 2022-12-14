package xim49_MenuManager;
import java.util.ArrayList;

public class MenuRandomize {

private ArrayList<Entree> entrees = new ArrayList<Entree>();
private ArrayList<Side> sides = new ArrayList<Side>();
private ArrayList<Salad> salads = new ArrayList<Salad>();
private ArrayList<Dessert> desserts = new ArrayList<Dessert>();
//

public MenuRandomize (String entreeFile, String sideFile, String saladFile, String dessertFile){
entrees = FileManager.readEntrees(entreeFile);
sides = FileManager.readSides(sideFile);
salads = FileManager.readSalads(saladFile);
desserts = FileManager.readDesserts(dessertFile);
}

public Menu randomMenu() {
//create a new menu object
Menu randMenu = new Menu ("Random Sample Plate");

//use setter for each item, based on size of array list * random
randMenu.setEntree(entrees.get( (int) (entrees.size() * Math.random() )));
randMenu.setSide(sides.get((int)(sides.size()*Math.random())));
randMenu.setSalad(salads.get((int)(salads.size()*Math.random())));
randMenu.setDessert(desserts.get((int)(desserts.size()*Math.random())));

return randMenu;
}

}

