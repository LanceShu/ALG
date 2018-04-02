package ALG;

import java.util.Stack;

public class 链表倒序打印 {

    static class Node{
        int value;
        Node next;
    }

    public static void main(String[] args) {
        Node node = new Node();
        Node no = new Node();
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                node.value = i;
                node.next = null;
                no = node;
            } else {
                Node n = new Node();
                n.value = i;
                n.next = null;
                no.next = n;
                no = no.next;
            }
        }
        calculate(node);
    }

    private static void calculate(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> nodeStack = new Stack<>();
        while (node != null) {
            nodeStack.push(node);
            node = node.next;
        }
        while (!nodeStack.isEmpty()) {
            Node node1 = nodeStack.pop();
            System.out.print(node1.value + " ");
        }
    }
}
