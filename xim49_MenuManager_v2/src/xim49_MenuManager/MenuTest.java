package xim49_MenuManager;

public class MenuTest {

	public static void main(String[] args) {
		Entree a = new Entree("abc","very goof",10000);
		Entree b = new Entree("def","full of MSG",100);
		Side c = new Side("ghi","a bit salty",10);
		Side d = new Side("jkl","just try it",103);
		Salad e = new Salad("mno","only contain one leaf",100000);
		Dessert f = new Dessert("pqr","bitter flavor",23);
		Menu one = new Menu("only half price",a,d);
		Menu two = new Menu("only take -100% off",b,c,e,f);
		
		System.out.println(one.getName());
		one.totalCalories();
		one.description();
		
		System.out.println(two.getName());
		two.totalCalories();
		two.description();
	}

}
