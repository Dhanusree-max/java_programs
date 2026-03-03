/*public class throwable_except {
    // error and exception are the subclasses of throwable class
    static void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be greater than 18");

        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            check(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/

/*public class throwable_except {
    public static void main(String[] args) {
        try {
            System.out.println("Try Starts");
            try {
                int a = 10, b = 0;
                System.out.println(a / b);
            } catch (ArithmeticException e) {

                // e.printStackTrace(); prints the error line number
                // System.out.println(e);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

*/

class One implements Runnable {
    String msg;

    One(String msg) {
        this.msg = msg;
    }

    public void run() { // this overrides the run method in parent class
        System.out.println(msg + " " + Thread.currentThread().getName());
    }

    void display() {
        System.out.println("Display");
    }
}

public class throwable_except {
    public static void main(String[] args) {
        Thread t1 = new Thread(new One("one"));
        Thread t2 = new Thread(new One("two"));
        Thread t3 = new Thread(new One("three"));
        t1.start();
        t2.start();
        t3.start();
        t1.display();

    }
}
