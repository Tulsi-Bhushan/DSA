
class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
    }
}

public class first {
    public static Node convert(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static boolean checlElement(Node head, int val) {
        while (head != null) {
            if (head.data == val)
                return true;
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 3, 4, 2, 3 };
        Node head = convert(arr);
        Node temp = head;
        System.out.println(checlElement(temp, 2));

    }
}
