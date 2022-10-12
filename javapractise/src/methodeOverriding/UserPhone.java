package methodeOverriding;
class Telicom {
	public  void getCallertune () {
		System.out.println("tring tring ..");
	}
}
class Govt extends Telicom {
	public  void getCallertune () {
		System.out.println("bsnl  tone ");
	}
}
class Boys extends Telicom{
	public  void getCallertune () {
		System.out.println("mass song ");
	}
}
class Girls extends Telicom {
	public  void getCallertune () {
		System.out.println("melody song");
	}
}

public class UserPhone {
	public static void main(String argsa[]) {
		Telicom tm=new Telicom(); 
		tm.getCallertune();  
		Govt gv= new Govt ();    
		gv.getCallertune();
		Boys bs =new Boys ();   
		bs.getCallertune();
		Girls gs=new Girls();     
		gs.getCallertune();
		
	
	
	
	}

}
