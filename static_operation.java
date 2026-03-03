/*import java.util.*;

// ---------- Method Overloading Example ----------
class over {
    String title;
    String author;

    // Constructor with two parameters
    over(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor with one parameter (overloading)
    over(String title) {
        this.title = title;
        this.author = "unknown";
    }

    public void details() {
        System.out.println("Title:  " + title);
        System.out.println("Author: " + author);
    }
}

// ---------- Bank Account with Encapsulation ----------
class BankAccount {
    private double balance;

    // Correct constructor
    BankAccount(double amount) {
        this.balance = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// ---------- Main Class ----------
public class Main {
    public static void main(String[] args) {

        // Method overloading demo
        over obj1 = new over("Java", "Martin");
        obj1.details();

        over obj2 = new over("Python");
        obj2.details();

        System.out.println(); // blank line

        // BankAccount demo
        BankAccount account = new BankAccount(5000);
        account.deposit(2000);
        account.withdraw(3000);
        System.out.println("Final Balance: " + account.getBalance());
    }
}*/
class Mobile {
    String brand;
    static String name;
    int price;
    String ok;
    int money;
    static String perlu;

    public void detailt() {
        System.out.println(brand + " : " + name + " : " + price);
    }

    public static void detail(Mobile obj1, Mobile obj3) {
        System.out.println("Here it starts the static Method");
        System.out.println(obj1.brand + " : " + name + " : " + obj1.price);
        System.out.println(obj3.brand + " : " + name + " : " + obj3.price);
    }

    public Mobile() {
        ok = "";
        money = 200;
        System.out.println("in constructor");

    }

    static {
        perlu = "ammu";
        System.out.println("in static block:  " + perlu);
    }

}

public class static_operation {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile.name = "dhanu";
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 20000;
        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.price = 50000;

        obj.detailt();
        obj2.detailt();

        Mobile.detail(obj, obj2);

        // Class.forName("Mobile");

    }
}
