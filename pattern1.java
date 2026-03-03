/*public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 2 || i == n - 1) {
                // full row
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            } else {
                // star space space star
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == 2 || j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}*/

public class pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print("* ");
                }

            }
            System.out.println(" ");
        }
    }
}
