
package method_return_type;

public class Areas {
	
	public static float areaOfCircle(int r) {
		return 3.14F*r*r;
	}
	public float cirOfCir(int r) {
		return 2*3.14F*r;
		
	}
	
 public static void main(String args[]) {
	 float area=areaOfCircle(5);
	 System.out.println(area);
	 Areas a1= new Areas();
	 float cir=a1.cirOfCir(25);
	System.out.println(cir);
	
	 
 }
}

