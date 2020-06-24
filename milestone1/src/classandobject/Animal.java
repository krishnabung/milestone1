package classandobject;

public class Animal {
	void eat1()
	{
		System.out.println("animal is eating");
	}
	void sleep1()
	{
		System.out.println("animal is sleeping");
	}

}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("bird is eating");
	}
	void sleep()
	{
		System.out.println("bird is sleeping");
	}
	void fly()
	{
		System.out.println("bird is flying");
	}

public static void main(String args[]) 
{
	//Animal a=new Animal();
	
	Bird b=new Bird();
	b.sleep();
	b.eat();
	b.fly();
	b.sleep1();
	b.eat1();
}
}

