import java.util.*;

public class spy_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int product = 1;
        int temp = a;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        if (sum == product) {
            System.out.println("spy");
        } else {
            System.out.println("no shitttttt");
        }
    }
}
