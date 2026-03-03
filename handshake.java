
/*import java.util.*;

public class handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = (n / 2);
        int ok = (n * result);
        System.out.println(ok);

    }
}*/
//no of handshakes of 15 students that the handshake should not be repeated by the person that have already given 
import java.util.*;

public class handshake {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = n - 1; i >= 1; i--) {
            result += i;
        }
        System.out.println(result);
    }
}
