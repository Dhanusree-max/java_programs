
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class with_str {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        int first = 0, last = sb.length() - 1;
        while (first < last) {
            char temp = sb.charAt(first);
            sb.setCharAt(first, sb.charAt(last));
            sb.setCharAt(last, temp);
            System.out.println("The End");
            first++;
            last--;
        }
        System.out.println(sb);
    }
}
*/
import java.util.*;

/*public class with_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        StringBuilder sb2 = new StringBuilder(str2);
        // remove vowels from the string without using builtin function
        int i = 0;
        while (i < sb2.length()) {
            char ch = sb2.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb2.deleteCharAt(i);
            } else {
                i++;
            }
        }
        System.out.println(sb2);
    }
}*/
public class with_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        StringBuilder sb2 = new StringBuilder(str2);
        String result = "";
        for (int i = 0; i < str2.length(); i++) {
            char ch = sb2.charAt(i);
            if (i % 2 != 0) {
                sb2.setCharAt(i, Character.toUpperCase(ch));
            } else {
                sb2.setCharAt(i, Character.toLowerCase(ch));
            }
        }
        System.out.println(sb2);

    }
}