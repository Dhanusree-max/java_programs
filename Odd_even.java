import java.util.*;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even_count = 0;
        int odd_count = 0;
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println("Even _Elements: " + even_count);
        System.out.println("Odd Elements: " + odd_count);
    }
}
