package oops;

public class Main {
	public static void main(String[] args) {
		Animal animal1= new Animal("Dog","Land");
		
//		animal1.setName("Dog");
		System.out.println(animal1.getName());
		System.out.println(animal1.getHabitat());
		animal1.eat();
		animal1.sleep();
		
		Animal animal2= new Animal("Cat","Land");
		System.out.println(animal2.getName());
		System.out.println(animal2.getHabitat());
	}
}
