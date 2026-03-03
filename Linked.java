class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;

    }
}

class LLmethods {
    Node head;

    void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void insertAtBegin(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertAtPos(int pos, int data) {
        Node newnode = new Node(data);

        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        // temp is used to traverse the list starting from the head
        Node temp = head;

        // Move temp until it reaches the SECOND-LAST node
        // We stop when temp.next.next is null
        // At this point:
        // temp → second-last node
        // temp.next → last node
        // temp.next.next → null
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteAtPos(int pos) {
        if (pos <= 0 || head == null) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }
        temp.next = temp.next.next;

    }

    static boolean searching(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;

    }

    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // store next node
            curr.next = prev; // reverse link
            prev = curr; // move prev forward
            curr = next; // move curr forward
        }
        head = prev; // update head
    }

}

public class Linked {
    public static void main(String[] args) {
        LLmethods l = new LLmethods();

        l.insert(10);
        l.insert(20);
        l.insertAtBegin(1);
        l.insertAtPos(2, 98); // Invalid Position
        // l.deleteAtBegin();
        // l.deleteAtEnd();
        // l.deleteAtPos(2);
        l.reverse();
        l.display();
        int key = 1;

        if (LLmethods.searching(l.head, key)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
