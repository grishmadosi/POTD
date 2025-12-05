public class Gcd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 10};
        int ans = findGCD(arr);
        System.out.println(ans);
    }
    public static int findGCD(int[] nums) {
        int n = nums.length;
        int max = nums[0], min = nums[1];
        if(max < min){
            int temp = min;
            min = max;
            max = temp;
        }
        for(int i = 2; i < n ; i++){
            if(nums[i] > max ){
                max = nums[i];
            }else if(nums[i] < min)
                min = nums[i];
        }
        while(min != 0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}
