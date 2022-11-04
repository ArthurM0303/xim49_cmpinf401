package xim49_MenuManager;

/**
 * Class Entree
 * @author Xinyi Ming 
 * created: 10/14/2022
 */
public class Entree {
	private String name;
	private String description;
	private int calories;
	
	/**
	 * This constructor creates a new entree based on user-provided parameters:
	 * name, description, and calories
	 * @param name the name of the dish
	 * @param description the description of the dish
	 * @param calories calories of the dish
	 */
	public Entree(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}

	/**
	 * Getter of the name of the entree
	 * @return the name of the entree
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the name
	 * @param name of the entree
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of the description of the entree
	 * @return the description of the entree
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the description
	 * @param description of the entree
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter of the calories of the entree
	 * @return the calories fo the entree
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * Setter of the calories
	 * @param calories of the entree
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}


}
