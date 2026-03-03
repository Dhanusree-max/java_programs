/*import java.util.*;

/public class Homework {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long c = sc.nextLong();
        System.out.println(a + b + c);
    }
}

*/

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        double total = price * quantity;
        System.out.println("\n----- Financial Report -----");
        System.out.printf("%-15s : %-20s%n", "product", product);
        System.out.printf("%-15s : %10.2f%n", "Price", price);
        System.out.printf("%-15s : %10d%n", "Quantity", quantity);
        System.out.printf("%-15s : %10.2f%n", "Total Amount", total);
        System.out.println("------------------------------");

    }
}