import java.util.Scanner;

public class logical_or {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();

        int result = 0;

        switch (op) {
            case "AND":
                result = a & b;
                break;

            case "OR":
                result = a | b;
                break;

            case "XOR":
                result = a ^ b;
                break;

            default:
                System.out.println("Invalid Operation");
                return;
        }

        System.out.println(result);
    }
}
