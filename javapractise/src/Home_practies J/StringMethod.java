import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String s ="Welcome";
        String s1= "to java";
        System.out.println("length of string:"+s.length());// length of string
        System.out.println(s.concat(s1)); // joining of String
          // trimming the string
        s="  Welcome    ";
        System.out.println("Before  trimming string is:"+s);
        System.out.println("After trimming string is:"+s.trim());


        //charAt()
        s ="Welcome";
        System.out.println(s.charAt(5) ); // return character based on index number ,index start from 0


        //contains()
         s = "Wellcome";
        System.out.println(s.contains("well"));
        System.out.println(s.contains("Well"));

        // comparing string equals()
        s = "Welcome";
        System.out.println(s.equals("Welcome"));// true
        System.out.println(s.equals("welcome"));// false
        System.out.println(s.equals("Welcome"));//false

        System.out.println(s.equalsIgnoreCase("wellcome"));//true
       //extracting  substring from the main string
          s="Welcome";
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(1,5));
        System.out.println(s.substring(2,3));

        //  converting case

        s="Welcome";
        System.out.println(s.toLowerCase());
        s="welcome";
        System.out.println(s.toUpperCase());



    }
}
