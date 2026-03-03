import java.util.*;

public class game1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();// 1000
        int n = sc.nextInt();// 2
        int max = 0, index = 0, greater = 0;
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();// 1000
            if (h >= max && h <= d) {
                if (h == max) {
                    continue;
                }
                max = h;
                index = i;

            }
            if (h > d) {
                greater++;
            }
            if (greater == n) {
                System.out.println("RETREAT");
                System.exit(0);
            }
        }
        System.out.println(index);

    }
}
