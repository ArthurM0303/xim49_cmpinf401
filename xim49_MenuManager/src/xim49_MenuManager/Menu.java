package xim49_MenuManager;

/**
 * Class Menu
 * @author Xinyi Ming
 * created: 10/14/2022
 *
 */
public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	/**
	 * This constructor creates a new based on user-provided parameters:
	 * name
	 * @param name the name of the menu
	 */
	public Menu(String name) {
		this.name = name;
	}
	
	/**
	 * This constructor creates a new based on user-provided parameters:
	 * name, entree, side
	 * @param name the name of the menu
	 * @param entree adds a entree
	 * @param side adds a side
	 */
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
	}
	
	/**
	 * This constructor creates a new based on user-provided parameters:
	 * name, entree, side, salad, dessert
	 * @param name the name of the menu
	 * @param entree adds a entree to the menu
	 * @param side adds a side to the menu
	 * @param salad adds a salad to the menu
	 * @param dessert adds dessert to the menu
	 */
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		this.dessert = dessert;
		this.side = side;
	}

	/**
	 * Calculate total amount of the calories for all dishes on the menu
	 * @return the amount of total calories (int)
	 */
	public int totalCalories() {
		if(salad != null) {
			System.out.println(entree.getCalories() + salad.getCalories() + side.getCalories() + dessert.getCalories());
		}
		else {
			System.out.println(entree.getCalories() + side.getCalories());
		}
		return 0;
	}

	/**
	 * Pulls out the description of all the dishes on the menu
	 */
	public void description() {
		
		if(salad != null) {
			System.out.println("Entree: " + entree.getDescription() + "\n Side: " + side.getDescription() + "\n Salad: "
					+ salad.getDescription() + "\n Dessert: " + dessert.getDescription());
		}
		else if(entree == null) {
			System.out.println("We are currently out of any food in the kitchen.");
		}
		else {
			System.out.println("Entree: " + entree.getDescription() + "\n Side: " + side.getDescription() + "\n Salad: N/A"
					+ "\n Dessert: N/A");
		}
		
	}

	/**
	 * Getter for the name
	 * @return the name of the menu
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name
	 * @param name for the menu
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for the entree of the menu
	 * @return the entree of the menu
	 */
	public Entree getEntree() {
		return entree;
	}

	/**
	 * Setter for the entree on the menu
	 * @param entree on the menu
	 */
	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	/**
	 * getter for the salad on the menu
	 * @return the salad on the menu
	 */
	public Salad getSalad() {
		return salad;
	}

	/**
	 * Setter for the salad on the menu
	 * @param salad on the menu
	 */
	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	/**
	 * Getter for the side on the menu
	 * @return the side on the menu
	 */
	public Side getSide() {
		return side;
	}

	/**
	 * Setter of the side on the menu
	 * @param side on the menu
	 */
	public void setSide(Side side) {
		this.side = side;
	}

	/**
	 * Getter of the dessert on the menu
	 * @return the dessert on the menu
	 */
	public Dessert getDessert() {
		return dessert;
	}

	/**
	 * Setter of the dessert on the menu
	 * @param dessert on the menu
	 */
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
}


