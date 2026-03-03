import java.util.*;

public class builder_str {
    public static void main(String[] args) {
        /*
         * String str = "Hello";
         * StringBuilder sb = new StringBuilder(str);
         * sb.insert(1, "hi");
         * System.out.println(sb);
         * System.out.println("capacity:   " + sb.capacity());
         * System.out.println("Length:     " + sb.length());
         * System.out.println(sb.replace(0, 3, "abghgjhk"));// last index excluded
         * System.out.println(sb.delete(0, 3));
         * System.out.println(sb.reverse());
         * sb.setCharAt(0, 'A');
         * System.out.println(sb);
         * sb.deleteCharAt(0);
         * System.out.println(sb);
         * StringBuffer sbr = new StringBuffer("Everyone");
         * // everything is same like string builder
         * System.out.println(sb.toString()); // to string used for that we cannot
         * change the string using string method
         * // but can be modified using string builder and buffer methods
         * System.out.println(sb.append("------end"));
         * // String s= "--*--"
         * // for(int i=1;i<s.length();i++){
         * // System.out.println();
         */

        int n = 5;
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            strb.append(i + " ");
        }
        System.out.println(strb);
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i + " ";
        }
        System.out.println(s);
    }
}
