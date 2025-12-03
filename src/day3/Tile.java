import java.util.Scanner;
public class Tile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long r1 = 0, r2 = 0;
            long n = in.nextInt();
            long m = in.nextInt();
            long a = in.nextInt();

            r1 = (n + a - 1)/a;
            r2 = (m + a - 1)/a;
            System.out.println(r1*r2);

    }
}
