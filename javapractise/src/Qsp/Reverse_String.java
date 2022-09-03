package Qsp;

public class Reverse_String {
    public static void main(String[] args) {
        String s= " my name is durga";
        String reversedstr="";

        for (int i=s.length()-1;i>=0;i--) {
            reversedstr = reversedstr + s.charAt(i);
        }

        System.out.println(reversedstr);

    }



    }



