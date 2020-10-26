package constructor_practice;

public class Menu {
	private String name;
	private float price;
	private int calories;

	public Menu() {
		System.out.println("---Item created---");
	}

	public Menu(String name, float price, int calories) {

		System.out.println("---" + name + " created" + "----");
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.print(name + " ");
		System.out.print(price + " ");
		System.out.println(calories);
	}
}
