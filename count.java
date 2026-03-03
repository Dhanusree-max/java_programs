import java.util.*;

public class count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            count += 1;
        }
        System.out.println(count);
    }
}
