import java.io.*;

/*public class string_builder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();// hello
        // System.out.println("Hello\"All\" ");
        System.out.println("Hello " + "\" " + str + " \" ");
    }
}*/
//"==" always checks the address
//concatination
public class string_builder {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "Hello";
        str = str.concat(" All");
        System.out.println(str);

    }
}
