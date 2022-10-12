package methodeOverriding;

class Parent {
     public void getMarried () {
    	 System.out.println("Arrange marriage");
     }
}
class Kids extends Parent{
	public void getMarried() {
		 System.out.println("love marriage");
		
	}
}
public class Societty {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.getMarried();
		Kids  k=new Kids();
		k.getMarried();
		
		
	}

}
