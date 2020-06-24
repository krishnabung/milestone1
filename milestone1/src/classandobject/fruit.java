package classandobject;


public class fruit {
	protected String name;
	protected String taste;
	protected int size;
	
	public fruit() {
		name = "Fruit name";
		taste = "Tase of the fruit";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}
class Apple extends fruit {
	
	public void eat() {
		System.out.println("It tastes like apple");
	}
}
class Orange extends fruit {
	
	public void eat() {
		System.out.println("It tastes like Orange");
	}
}
class Assignment1 {

	public static void main(String[] args) {
		new fruit().eat();
		new Apple().eat();
		new Orange().eat();

	}

}