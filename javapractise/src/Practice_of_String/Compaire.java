package Practice_of_String;

public class Compaire {
	public static void main(String args[]) {
		/*
		System.out.println('a'+'b');
		System.out.println("a"+"b");
		System.out.println();
		System.out.println();*/
		  // String builder examples
		   
		        StringBuilder builder=new StringBuilder();
		        for (int i=0;i<26;i++){
		            char ch=(char)('a' + 1);
		            builder.append(ch);

		        }
		        System.out.println(builder.toString());
		    }
		

	}
		

