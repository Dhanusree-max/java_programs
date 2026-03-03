import java.util.Scanner;
import java.math.BigInteger;

class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger p1 = new BigInteger(sc.next());
        BigInteger p2 = new BigInteger(sc.next());

        BigInteger temp = p1;
        p1 = p2;
        p2 = temp;

        System.out.println(p1 + " " + p2);
        sc.close();
    }
}
