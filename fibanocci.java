
/*import java.util.*;

public class fibanocci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}*/
import java.util.*;

public class fibanocci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        while (true) {
            int c = a + b;
            if (c == n) {
                System.out.println("Fibonacci");
                break;
            } else if (c > n) {
                System.out.println("Not fibanacci");
                break;
            }
            a = b;
            b = c;
        }
    }
}
