class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class CCLMethods {
    Node head;

    void insertAtEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            newnode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
    }

    void insertAtBegin(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            newnode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newnode.next = head;
        temp.next = newnode;
        head = newnode;
    }

    void insertAtPos(int pos, int data) {
        if (pos == 1) {
            insertAtBegin(data);
            return;
        }
        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.println("Invalid Position");
                return;
            }
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void deleteAtEnd() {
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }
}

public class CircularLinked {
    public static void main(String[] args) {
        CCLMethods obj = new CCLMethods();
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtBegin(5);
        obj.insertAtPos(3, 34);
        obj.deleteAtEnd();
        obj.display();
    }

}