package inheritance;

class  DomesticAnimal{
	public void eat() {
		
		System.out.println("Animal eats");
		
	}
}
class Dog1 extends DomesticAnimal{
	public void bark() {
	System.out.println("Dog barks");
   } 
}
class Cat extends Dog1{
	public void meow() {
		System.out.println("Cat meow's");
		
	}
}

public class Forest1 {

	public static void main(String[] args) {
	Cat c= new Cat();
	c.eat();
    c.bark();
    c.meow();
	}

}
