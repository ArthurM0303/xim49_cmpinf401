package xim49_MenuManager;

/**
 * Class Dessert
 * @author Xinyi Ming
 * created: 10/14/2022
 *
 */
public class Dessert {
	private String name;
	private String description;
	private int calories;
	
	/**
	 * This constructor creates a new Dessert based on user-provided parameters:
	 * name, description, and calories
	 * @param name the name of the dish
	 * @param description the description of the dish
	 * @param calories calories of the dish
	 */
	public Dessert(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}

	/**
	 * Getter of the name of the dessert
	 * @return the name of the dessert
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the name of the dessert
	 * @param name of the dessert
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of the description of the dessert
	 * @return the description of the dessert
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the description of the dessert
	 * @param description of the dessert
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter of the calories of the dessert
	 * @return the calories of the dessert
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * Setter of the calories of the dessert
	 * @param calories of the dessert
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	

}
