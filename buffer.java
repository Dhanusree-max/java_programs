import java.io.*;

public class buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(str);

    }
}
// to calculate the length of a without using length function
/*
 * import java.io.*;
 * public class Main{
 * public static void main(String[] args)throws IOException{
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * String str=br.readLine();
 * int count=0;
 * for(char char:str.toCharArray())
 * count++;
 * System.out.println(count)
 * }}
 */