package stringdemo;

public class StringProgramsDemo {
    public static void main(String[] args) {
        String s = new String("jave deveper");
        int len = s.length();
        System.out.println(len);
        int count =0;
        for (int i =0;i<=len; i++){
            char ch= s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                count++;
                System.out.println(count);
                System.out.println(ch);
            }
        }
        System.out.println(count);
    }
}
