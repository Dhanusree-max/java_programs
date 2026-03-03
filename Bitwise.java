import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Bit 4:" + ((n & 4) == 4 ? 1 : 0));
        System.out.println("bit 16:" + ((n & 16) == 16 ? 1 : 0));
        System.out.println("bit 32:" + ((n & 32) == 32 ? 1 : 0));
    }
}
