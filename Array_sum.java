
/*import java.util.*;

public class Array_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array is: " + sum);
    }

}*/
//one way of doing sum of array without size
/*import java.util.*;

public class Array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == -1) { // stopping condition
                break;
            }

            arr.add(num); // store number
            sum = sum + num; // add to sum
        }

        System.out.println("Sum of array is: " + sum);
    }
}*/

//another way

/*import java.util.*;

public class Array_sum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers separated by space:");

        String line = sc.nextLine(); // take full line
        String[] parts = line.split(" "); // split numbers

        int[] arr = new int[parts.length]; // NOW size is known
        int sum = 0;

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
            sum = sum + arr[i];
        }

        System.out.println("Sum of array is: " + sum);
    }
}*/

import java.util.*;

public class Array_sum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr.add(num);
        }

        // for-each loop
        for (int x : arr) {
            sum = sum + x;
        }

        System.out.println("Sum of array is: " + sum);
    }
}
