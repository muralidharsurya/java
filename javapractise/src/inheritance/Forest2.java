package inheritance;


class  DomesticAnima2{
	public void eat() {
		
		System.out.println("Animal eats");
		
	}
}
class Dog2 extends DomesticAnima2{
	public void bark() {
	System.out.println("Dog barks");
   } 
}
class Cat1 extends DomesticAnima2{
	public void meow() {
		System.out.println("Cat meow's");
		
	}
}

public class Forest2 {

	public static void main(String[] args) {
		Cat1 c=new Cat1();
		
		Dog2 d=new Dog2();
		c.eat();
		
		d.eat();
		d.bark() 
		;c.meow();
	    
	

	}

}
