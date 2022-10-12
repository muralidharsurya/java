package stringdemo;


public class ReverseString {
    public static void main(String[] args) {
        String s = "Madam";
        int len = s.length();
        String rev ="";
        for (int i=len-1;i>=0; i--){
            char ch = s.charAt(i);
            rev=rev+ch;
        }
        System.out.println("Reverse of String "+rev);
        if (rev.equalsIgnoreCase(s))
            System.out.println("palindrome String ");
            else
            System.out.println("Not Palindrome String ");



}}
