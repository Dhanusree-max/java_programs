import java.util.*;

public class opt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] p = s.split(",");
        String product = p[0];
        double price = Double.parseDouble(p[1]);
        int qty = Integer.parseInt(p[2]);
        System.out.printf("%-20s%12.3f%8d", product, price, qty);
    }

}
