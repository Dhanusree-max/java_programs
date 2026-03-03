import java.util.*;

public class freq_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 1, 2, 2, 3 };
        int len = arr.length;
        boolean freq[] = new boolean[len];
        for (int i = 0; i < len; i++) {
            freq[i] = false;
        }
        for (int i = 0; i < len; i++) {
            if (freq[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = true;

                }
            }
            System.out.println(arr[i] + "->" + count);
        }

    }
}
