class Element {
    int[] stack;
    int top;
    int size;

    Element(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    int peek() {
        return stack[top];
    }

    int pop() {
        return stack[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i] + " ");
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        Element obj = new Element(5);
        obj.push(8);
        obj.push(9);
        obj.display();
    }
}