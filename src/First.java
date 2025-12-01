/*Code forces: https://codeforces.com/contest/546/submission/351418655*/
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextInt();
        long n = in.nextInt();
        long w = in.nextInt();
        in.close();
        long totalCost = k * (w * (w + 1)/ 2);
        long borrowAmount = 0;
        if(totalCost > n){
            borrowAmount = totalCost - n;
        }
        System.out.println(borrowAmount);
    }
}
