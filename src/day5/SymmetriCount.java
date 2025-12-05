import java.util.Scanner;
public class SymmetriCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low = in.nextInt();
        int high = in.nextInt();
        int ans = countSymmetricIntegers(low, high);
        System.out.println(ans);
    }
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i <= high; i++){
            String s = Integer.toString(i);
            if(s.length() == 2){
                if(s.charAt(0) == s.charAt(1)){
                    count++;
                }
            }
            if(s.length() == 4){
                int sum1 = (s.charAt(0) -'0') + (s.charAt(1) - '0');
                int sum2 = (s.charAt(2) -'0') + (s.charAt(3) - '0');
                if(sum1 == sum2){
                    count++;
                }
            }
        }
        return count;
    }
}
