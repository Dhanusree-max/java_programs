class A {
    public A() {
        this(10); // calls A(int)
        System.out.println("in A");
    }

    public A(int a) {
        System.out.println("in int A");
    }
}

class B extends A {
    public B() {
        this(10); // calls B(int)
        System.out.println("in B");
    }

    public B(int a) {
        super(); // calls A()
        System.out.println("in int B");
    }
}

public class This_super {
    public static void main(String[] args) {
        B obj = new B();
    }
}
