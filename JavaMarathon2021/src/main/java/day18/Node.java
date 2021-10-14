package day18;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public static void addNode(Node node, int value){
        if (value < node.value){
            if (node.leftChild == null) {
                Node newNode = new Node(value);
                node.leftChild = newNode;
            }
            else
                addNode(node.leftChild, value);
        }
        else{
            if (node.rightChild == null) {
                Node newNode = new Node(value);
                node.rightChild = newNode;
            }
            else
                addNode(node.rightChild, value);
        }
    }

    public static void dfs(Node node){
        if (node.leftChild != null){
            dfs(node.leftChild);
        }
        System.out.print(node.value + " ");
        if (node.rightChild != null)
            dfs(node.rightChild);

    }
}
