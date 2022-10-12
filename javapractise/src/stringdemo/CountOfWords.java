package stringdemo;

public class CountOfWords {
    public static void main(String[] args) {
        String s = "jave  deveper";
        int len = s.length();
        int count =1;
        for (int i =0;i<len; i++)
        {
            if (s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                count++;
            }

            }
        System.out.println(count);
        }

}
