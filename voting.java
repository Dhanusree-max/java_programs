import java.util.*;

public class voting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        while (true) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age == -1) {
                break;
            }
            if (age > 18) {
                System.out.println("X party");
                System.out.println("Y party");
                System.out.println("Z party");
                int candidate = sc.nextInt();
                switch (candidate) {
                    case 1:
                        System.out.println("Your vote goes to x party");
                        x++;
                        break;
                    case 2:
                        System.out.println("Your vote goes to y party");
                        y++;
                        break;
                    case 3:
                        System.out.println("Your vote goes to z party");
                        z++;
                        break;
                }
            } else {
                System.out.println("your not eligible");
            }
        }
        if ((x > y) && (x > z)) {
            System.out.println("X wins the party");
        } else if (y > z) {
            System.out.println("Y wins the party");
        } else {
            System.out.println("Z wins the party");
        }
    }

}
