import java.math.BigInteger;
import java.util.*;

public class Big {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger sum = a.add(b).add(c);
        System.out.println("Sum = " + sum);
    }
}
