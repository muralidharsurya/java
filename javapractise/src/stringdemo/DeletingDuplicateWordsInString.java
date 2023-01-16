package stringdemo;

public class DeletingDuplicateWordsInString {
    public static void main(String[] args) {
        String s = " we are test engineers in infosys in test we are are";
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if(str[i].equals(str[j])){
                    count++;
                    str[j]=" ";

                }
            }
            if (str[i]!=" " && count>=1){
                System.out.print(str[i]+" ");

            }
        }
        System.out.println();
    }
}