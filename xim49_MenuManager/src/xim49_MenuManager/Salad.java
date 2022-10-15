package xim49_MenuManager;

/**
 * Class Salad
 * @author Xinyi Ming
 * created: 10/14/2022
 *
 */
public class Salad {
	private String name;
	private String description;
	private int calories;
	
	/**
	 * This constructor creates a new Salad based on user-provided parameters:
	 * name, description, and calories
	 * @param name the name of the dish
	 * @param description the description of the dish
	 * @param calories calories of the dish
	 */
	public Salad(String name, String description, int calories) {
		this.name = name;
		this.description = description;
		this.calories = calories;
	}

	/**
	 * Getter of the name for the salad
	 * @return the name of the salad
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the name for the salad
	 * @param name of the salad
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter of the description of the salad
	 * @return the description of the salad
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the description of the salad
	 * @param description of the salad
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter of the calories of the salad
	 * @return the calories of the salad
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * Setter of the calories of the salad
	 * @param calories of the salad
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}
	

}
