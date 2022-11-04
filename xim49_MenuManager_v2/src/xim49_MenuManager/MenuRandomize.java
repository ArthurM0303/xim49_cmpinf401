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
	
	

}
