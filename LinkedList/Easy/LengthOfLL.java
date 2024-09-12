
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

    public static int lengthLL(Node head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 3, 4, 2, 3 };
        Node head = convert(arr);
        Node temp = head;
        int cnt = lengthLL(temp);
        System.out.println(cnt);

    }
}
