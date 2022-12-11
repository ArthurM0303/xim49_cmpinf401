package xim49_MenuManager;
import java.util.ArrayList;
public class MenuRandomize {

private ArrayList<Entree> entree;
private ArrayList<Salad> salad;
private ArrayList<Dessert> dessert;
private ArrayList<Side> side;

public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
    entree = FileManager.readEntrees(entreeFile);
    dessert = FileManager.readDesserts(dessertFile);
    side= FileManager.readSides(sideFile);
    salad= FileManager.readSalads(saladFile);
}

public void randomMenu() {
    ArrayList<Menu> menu;
    int indexEntrees=(int) Math.random() * entree.size() - 1;
    entree = entrees.get(indexEntrees);

    int indexD=(int) Math.random() * dessert.size() - 1;
    dessert = desserts.get(indexD);
                             //<----add element here to arrayList <Menu>?
    int indexSalad=(int) Math.random() * salad.size() - 1;
    salad = salads.get(indexSalad);

    int indexSide=(int) Math.random() * side.size() - 1;
    entree = sides.get(indexSide);

    return; //<--- return Menu?
}
}