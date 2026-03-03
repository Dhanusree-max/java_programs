import java.util.Scanner;
import java.io.*;

interface A {
    void msg();
}

interface B {
    void msg1();
}

class Third implements A, B {
    public void msg() {
        System.out.println("Msg is executed");
    }

    public void msg1() {
        System.out.println("Msg1 is executed");
    }
}

public class practice_interface {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Third obj = new Third();
        obj.msg();
        obj.msg1();
    }
}
