package lesson5;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

public class hw5 {
    //   метод для обхода дерева
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        Node n7 = new Node(7);
        Node n9 = new Node(9);
        Node n11 = new Node(11);
        Node n20 = new Node(20);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n4.left = n7;
        n4.right = n9;

        n3.left = n5;
        n3.right = n6;

        n6.left = n11;
        n6.right = n20;

        System.out.println("preOderNLR");
        preOderNLR(n1, "");
//        System.out.println("postOderLRN");
//        postOrderLRN(n1, "  ");
    }

    static void preOderNLR(Node root, String sp) {
        if (root != null) {
            System.out.print(sp + root.value);

            if (root.left != null)
                System.out.print("(");
            preOderNLR(root.left, sp);

            if (root.right != null && root.left != null)
                System.out.print(",");
            if(root.left != null && root.right == null)
                System.out.print("null");

            preOderNLR(root.right, sp);
            if (root.right != null)
                System.out.print(")");
        }
    }
    static void postOrderLRN(Node root, String sp) {
        if (root != null) {
            postOrderLRN(root.left, sp + "  ");
            postOrderLRN(root.right, sp + "  ");
            System.out.println(sp + root.value);
        }
    }
    static void InorderLNR(Node root, String sp) {
        if (root != null) {
            InorderLNR(root.left, sp + "  ");
            System.out.println(sp + root.value);
            InorderLNR(root.right, sp + "  ");
        }
    }
    static void ReversePreOrderNRL(Node root, String sp) {
        if (root != null) {
            System.out.println(sp + root.value);
            ReversePreOrderNRL(root.right, sp + "  ");
            ReversePreOrderNRL(root.left, sp + "  ");
        }
    }
    static void reversePostOrderRLN(Node root, String sp) {
        if (root != null) {
            reversePostOrderRLN(root.right, sp + "  ");
            reversePostOrderRLN(root.left, sp + "  ");
            System.out.println(sp + root.value);
        }
    }
    static void ReverseInorderLNR(Node root, String sp) {
        if (root != null) {
            ReverseInorderLNR(root.right, sp + "  ");
            System.out.println(sp + root.value);
            ReverseInorderLNR(root.left, sp + "  ");
        }
    }


}




