import java.util.*;

class Stack {
    int[] stack;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
        // System.out.println(data+" pushed");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stack[top] + " popped");
        top = top - 1;

    }

    void peek() {
        System.out.println("Peak:" + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print((char) stack[i]);
            }
        }
    }
}

public class Stack_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack obj = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            obj.push(str.charAt(i));
        }
        obj.display();
    }
}