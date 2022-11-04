package xim49_MenuManager;

/**
 * Class Side
 * @author Xinyi Ming
 * created: 10/14/2022
 *
 */
public class Side {
	private String name;
	private String description;
	private int calories;
	
	/**
	 * This constructor creates a new Side based on user-provided parameters:
	 * name, description, and calories
	 * @param name the name of the dish
	 * @param description the description of the dish
	 * @param calories calories of the dish
	 */
	public Side(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}

	/**
	 * Getter of the name of the Side
	 * @return the name of the side
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the name of the side
	 * @param name of the side
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of the description of the side
	 * @return the description of the side
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the description
	 * @param description of the side
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter of the calories of the side
	 * @return the calories of the side
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * Setter of the calories 
	 * @param calories of the side
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	

}
