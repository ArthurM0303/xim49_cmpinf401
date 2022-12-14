package xim49_MenuManager;

public class MenuTest {

	public static void main(String[] args) {

		Entree steak = new Entree("Steak", "Grilled cow meat", 600);
		Entree fish = new Entree("Fish", "Grilled salmon", 300);
		Side potato = new Side("Potato", "Boiled potato", 250);
		Side potato2 = new Side("Potato, mashed", "Mashed potato", 200);
		Salad potatoSalad = new Salad("Potato salad", "Salad version of potoatoes", 270);
		Salad greenSalad = new Salad("Green salad", "Mixed vegetables", 189);
		Dessert cake = new Dessert("Cake", "Real cake", 311);
		Dessert iceCream = new Dessert("Ice Cream", "Vanilla", 217);

		Menu water = new Menu("Water only");
		Menu steakAndPotatoMeal = new Menu("Steak and Potato", steak, potato);
		Menu fishMeal = new Menu("Fish dinner", fish, potato2, greenSalad, cake);

		Menu cakeOnly = new Menu("Cake dinner");
		cakeOnly.setDessert(cake);
		Menu iceCreamOnly = new Menu("Ice cream dinner", new Entree("Steak", "Grilled cow meat", 600),
				new Side("Potato", "Boiled potato", 250), new Salad("Potato salad", "Salad version of potoatoes", 270),
				iceCream);

		System.out.println(steakAndPotatoMeal.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + steakAndPotatoMeal.totalCalories() + "\n");

		System.out.println(fishMeal.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + fishMeal.totalCalories() + "\n");

		System.out.println(water.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + water.totalCalories() + "\n");

		System.out.println(cakeOnly.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + cakeOnly.totalCalories() + "\n");

		System.out.println(iceCreamOnly.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + iceCreamOnly.totalCalories() + "\n");

		Menu fishAndPotatos = new Menu("Fish and potato salad", fish, potato, potatoSalad, cake); // just here to not
																									// have an
																									// unreferenced
																									// object
		fishAndPotatos.setDessert(new Dessert("Cake", "Real cake", 311)); // cake is gone
		System.out.println(fishAndPotatos.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + fishAndPotatos.totalCalories() + "\n");
		iceCreamOnly.setSide(potato); // add potato to ice cream
		steakAndPotatoMeal.setEntree(new Entree("Steak", "Grilled cow meat", 600)); // remove meat from this meal, still
																					// not sure how to set a component
																					// to null without creating a new
																					// object in there
		steakAndPotatoMeal.setName("Potato only. Steak is unavailable today. ");
		System.out.println(iceCreamOnly.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + iceCreamOnly.totalCalories() + "\n");
		System.out.println(steakAndPotatoMeal.descriptionOfMeal());
		System.out.println("The total calories of this meal is " + steakAndPotatoMeal.totalCalories() + "\n");

	}

}