package arrays;
// using Pass an Array
public class PalindromInArray {
    public static void palindrome(int s[]){

        for (int i =0;i<s.length;i++) {
            int num = s[i], rev = 0, rem;

            while (num > 0) {
                rem = num % 10;
                num = num / 10;
                rev = rev * 10 + rem;
            }
            if (rev == s[i])
                System.out.println(s[i]+  "palindrome number");
        }
  
    }

    public static void main(String[] args) {
        int a[]={ 121,342,343,543,545};
        palindrome(a);

    }

}
