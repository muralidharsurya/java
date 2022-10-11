package inheritance;

public class ArrayDemo {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j=i;j<= nums.length-1;j++){
                if(i==j){
                    continue;
                }
                if (nums [i]+nums[j]==target){
                    return new int [] {i,j};
            }

            }


        }
        return  null;
      
    }

    public static void main(String[] args) {
         // twoSum();
    }
}
