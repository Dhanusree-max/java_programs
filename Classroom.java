/*import java.io.*;

class class_room {
    void msg() {
        System.out.println("Without parameters");

    }

    void msg(int n) {
        System.out.println("Method with 1 parameter  " + n);
    }

    void msg(int a, int b) {
        System.out.println("Method with 2 parameters  " + a + b);
    }

    void msg(String a, String b) {
        System.out.println("Method with 3 String params  " + a + b);
    }
}

public class Classroom {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        class_room obj = new class_room();
        obj.msg();
        obj.msg(1);
        obj.msg(2, 3);
        obj.msg("HI", "Hello");

    }
}
*/

//runtime polymorphism
/*import java.util.*;
import java.io.*;

class Parent {
    void msg() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void msg() {
        System.out.println("Child Class");
    }
}

public class Classroom {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Child obj = new Child();
        obj.msg();
    }
}*/

//child object only refers parent class
/*import java.util.*;
import java.io.*;

class Parent {
    void msg() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void cmsg() {
        System.out.println("Child Class");
    }
}

public class Classroom {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Parent obj = new Child();
        { // upcasting Happens
          // obj is a child object,with the help of this we can access only parent
          // methods.
            obj.msg();
            obj.cmsg();// Eventhough obj is a child object, we cant access child methods
        }
    }
}*/

//downcasting 

/*import java.util.*;
import java.io.*;

class Parent {
    void msg() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void cmsg() {
        System.out.println("Child Class");
    }
}

public class Classroom {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Parent obj = new Child();
        { // upcasting Happens
          // obj is a child object,with the help of this we can access only parent
          // methods.
            obj.msg();
            //obj.cmsg();
            // Eventhough obj is a child object, we cant access child methods
            if(obj instanceof Child){
                Child obj1=(Child) obj; //downcasting happening here
                //previously obj only refer Parent Methods, now we're converting the Child object to refer both Parent and Child,known as downcasting
                obj1.msg();
                obj1.cmsg();//with the help of obj1,we can access both Parent and Child
                
            }

        }
    }
}*/

/*import java.util.*;
import java.io.*;

abstract class Parent {
    abstract void msg();

    abstract void msg1();

    void check() {
        System.out.println("This is a concrete method in abstract class");
    }
}

class Child extends Parent {
    // if we are abstract class to normal class then we must implement all abstract
    // methods of parent class first
    void msg() {
        System.out.println("This is child class msg method");
    }

    void msg1() {
        System.out.println("This is child class msg1 method");
    }
}

public class Classroom {
    public static void main(String[] argss) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Child c = new Child();
        c.msg();
        c.msg1();
        c.check();
    }
}

*/
import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == (n - 1)) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            } else {
                String b = "";
                for (int k = 1; k <= n; k++) {
                    if (k == 1 | k == n) {
                        b += "* ";
                    } else {
                        b += "  ";
                    }
                }
                System.out.println(b);
            }
        }
    }
}