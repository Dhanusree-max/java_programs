/*import java.util.*;

public class Anagram {
    public static boolean isanagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isanagram(s, t)) {
            System.out.println("it is an anagram");
        } else {
            System.out.println("it is not an anagram");
        }
    }
}*/

/*import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 7;
        for (int i = 1; i <= n; i++) {
            System.out.print(value + " ");
            if (i % 2 != 0) {
                value -= 2;
            } else {
                value += 3;
            }
        }
    }
}*/

// input : 5
// output: 7 5 8 6 9
// input : 7
// output:7 5 8 6 9 7 10
// in the form of this series
// another with some other logic
/*import java.io.*;

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n = Integer.parseInt(br.readLine());
        int num = 6;
        int diff = 3;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num += diff;
            diff += 2;
        }

    }
}
// this will be in this series 6 9 14 21 .........

*/

/*public class Anagram {

    public static int longestPalindromeSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int start = 0; start < n; start++) {

            int[] freq = new int[26];

            for (int end = start; end < n; end++) {

                char ch = s.charAt(end);
                freq[ch - 'a']++;

                int oddCount = 0;
                for (int i = 0; i < 26; i++) {
                    if (freq[i] % 2 != 0) {
                        oddCount++;
                    }
                }

                if (oddCount <= 1) {
                    int length = end - start + 1;
                    maxLen = Math.max(maxLen, length);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "aabcbc";

        int result = longestPalindromeSubstring(s);

        System.out.println("Input String: " + s);
        System.out.println("Length of input string: " + s.length());
        System.out.println("Longest substring length that CAN be rearranged into a palindrome: " + result);
    }
}
*/

// Travel agency rents vehicles and charges money based on the total travel time.
// travel time is given in minutes.Charges are calculated in hours.If there are extra minutes,the time is rounded up to the next hour.
//The agency charges R1 rupees per hour for the first N hours. R2 rupees per hour for the remaining hours
// R1->rate for the first N hours.N->numbers of hours charged at R1 R2->rate after N hours. total_mins->total travel time in minutes.
//output: calculate and print the total travelling cost.
import java.io.IOException;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int N = sc.nextInt();
        int R2 = sc.nextInt();
        int total_mins = sc.nextInt();
        int hours = total_mins / 60;
        if (total_mins % 60 > 0) {
            hours++;
        }
        int cost;
        if (hours <= N) {
            cost = hours * R1;
        } else {
            cost = (N * R1) + (hours - N) * R2;
        }
        System.out.println(cost);
        sc.close();
    }
}

// diamond pattern
/*
 * import java.util.Scanner;
 * 
 * public class DiamondPattern {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter number of rows: ");
 * int n = sc.nextInt();
 * 
 * // Upper half
 * for (int i = 1; i <= n; i++) {
 * // spaces
 * for (int j = i; j < n; j++) {
 * System.out.print(" ");
 * }
 * // stars
 * for (int k = 1; k <= (2 * i - 1); k++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * 
 * // Lower half
 * for (int i = n - 1; i >= 1; i--) {
 * // spaces
 * for (int j = n; j > i; j--) {
 * System.out.print(" ");
 * }
 * // stars
 * for (int k = 1; k <= (2 * i - 1); k++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * 
 * sc.close();
 * }
 * }
 */