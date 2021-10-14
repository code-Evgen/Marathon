package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        Node.addNode(root, 11);
        Node.addNode(root, 27);
        Node.addNode(root, 23);
        Node.addNode(root, 5);
        Node.addNode(root, 150);
        Node.addNode(root, 15);
        Node.addNode(root, 22);
        Node.addNode(root, 14);
        Node.addNode(root, 8);
        Node.addNode(root, 24);
        Node.addNode(root, 16);
        Node.addNode(root, 18);

        Node.dfs(root);
    }
}