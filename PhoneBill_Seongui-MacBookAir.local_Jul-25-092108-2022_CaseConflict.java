import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total_Y = 0, total_M = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            total_Y += 10 + (10 * x % 30);
            total_M += 15 + (15 * x % 60);
        }

        if (total_M < total_Y) System.out.println("M " + total_M);
        else if (total_M > total_Y) System.out.println("Y " + total_Y);
        else System.out.println("Y M " + total_M);
    }
}
