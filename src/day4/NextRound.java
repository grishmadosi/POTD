import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
           arr[i] = in.nextInt();
      }
      int m = arr[k-1], count = 0;
      for(int i = 0; i < n ; i++){
          if(arr[i] != 0 && arr[i] >= m){
              count++;
          }
      }
        System.out.println(count);
    }
}
