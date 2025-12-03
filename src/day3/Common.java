import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Common {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums1 = { 1, 1, 3, 2};
        int[] nums2 = { 2, 3};
        int[] nums3 = {3 };
        List<Integer> result = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            int[] arr1 = new int[101];
            int[] arr2 = new int[101];
            int[] arr3 = new int[101];

            for(int a : nums1) arr1[a] = 1;
            for(int a : nums2) arr2[a] = 1;
            for(int a : nums3) arr3[a] = 1;
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 1; i <= 100; i++){
                if(arr1[i] + arr2[i] + arr3[i] >= 2){
                    list.add(i);
                }
            }
            return list;
        }
    }

