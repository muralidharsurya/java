package inheritance;


class Animal{
	public void eat() {
		
		System.out.println("Animal eats");
		
	}
}
class Dog extends Animal{
	public void bark() {
	System.out.println("Dog barks");
   } 
}

public class Forest {
	public static void main (String args[]) {
		Dog d=new Dog();
		d.bark();
		d.eat();
		
	}

}
