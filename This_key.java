//to distinguish instance variables from local variables

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id; // instance variable
        this.name = name; // instance variable
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class This_key {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ravi");
        s1.display();
    }
}

// to call current class method

class Demo {
    void show() {
        System.out.println("Show method");
    }

    void display() {
        this.show(); // calling current class method
    }
}

// Used inside a constructor to call another constructor of the same class.

class Test {
    Test() {
        System.out.println("Default constructor");
    }

    Test(int a) {
        this(); // calls default constructor
        System.out.println("Parameterized constructor");
    }
}

// to pass current object as parameter

// Sometimes we pass the current object to another method or constructor.

class A {
    void display(A obj) {
        System.out.println("Method called");
    }

    void call() {
        display(this);
    }
}

// to return current object

// Mostly used in method chaining.

class Box {
    int length;

    Box setLength(int length) {
        this.length = length;
        return this;
    }

    void show() {
        System.out.println(length);
    }
}

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        b.setLength(10).show();
    }
}
