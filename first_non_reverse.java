import java.util.Scanner;

public class first_non_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        boolean arr[] = new boolean[len];
        for (int i = 0; i < len; i++) {
            arr[i] = false;
        }
        for (int i = 0; i < len; i++) {
            if (arr[i]) {
                continue;

            }
            int count = 0;
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    arr[j] = true;
                }
            }

            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

}