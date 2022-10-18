package stringdemo;

public class Duplicatechar {
    public static void main(String[] args) {
        String str = "javadeveloper";
        char[] ch =str.toCharArray();
        System.out.println("String is :"+str);
        System.out.println("duplicate character:");
        int count =0;
        for (int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){

                if(ch[i]==ch[j]){
                    count++;
                    System.out.println(ch[j]+" ");
                    System.out.println(count);
                }

            }

        }



    }
}
