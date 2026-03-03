/*import java.util.Scanner;
public class MagiacNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += a[0][j];
        }
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += a[i][j];
            }
            if (rowSum != magicSum) {
                System.out.println("no");
                return;
            }
        }
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += a[i][j];
            }
            if (colSum != magicSum) {
                System.out.println("no");
                return;
            }
        }
        int diag1 = 0;
        for (int i = 0; i < n; i++) {
            diag1 += a[i][i];
        }
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            diag2 += a[i][n - i - 1];
        }
        if (diag1 != magicSum || diag2 != magicSum) {
            System.out.println("no");
            return;
        }
        System.out.println("yes");

    }

}*/

import java.util.*;

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class Advcalc extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

public class MagiacNumber {
    public static void main(String[] args) {
        Advcalc obj = new Advcalc();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.sub(2, 1));
        System.out.println(obj.mul(3, 4));
        System.out.println(obj.div(4, 2));
    }
}
