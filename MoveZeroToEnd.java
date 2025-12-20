public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
            int j = -1;
            for(int i = 0; i<nums.length; i++){
                if(nums[i] != 0){
                    j++;
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
    }
}
