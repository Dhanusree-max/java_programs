import java.util.*;

public class reversearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;

        }
    }
}
