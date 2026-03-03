import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Without_builtin_upper {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (str.charAt(i) + 32));
            } else {
                sb.append((char) (str.charAt(i) - 32));
            }

        }
        System.out.println(sb.toString());
    }
}
/*
 * import java.io.*;
 * 
 * public class With_builtin_upper {
 * public static void main(String args[]) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * String str = br.readLine();
 * StringBuilder sb = new StringBuilder();
 * for (int i = 0; i < str.length(); i++) {
 * char ch=str.charAt(i);
 * if(Character.isUpperCase(ch)){
 * sb.append(Character.tolowerCase(ch));
 * else
 * sb.append(Character.toUpperCase(ch));
 * }
 * System.out.println(sb.toString());
 * }
 * }
 */