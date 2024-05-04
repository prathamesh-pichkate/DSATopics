//In this We have done the operation:


import java.util.LinkedList;
import java.util.*;

public class BuildBT {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    //Formation of binaryTree:
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            // Check if root is empty
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

    // Preorder traversal: Root->Left->Right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
 }


    // Inorder traversal: Left->Root->Right
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder traversal: Left->Right->Root
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //Level Order Traversal: BFS
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        //Created the queue as it helps to perform BFS due to its FIFO manner.....
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int count=0;
        while(!q.isEmpty()){
            Node currNode= q.remove();
            if(currNode==null){
                count++;
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data + " ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        System.out.println("Height of the tree is"+count);
    }


    //height of the tree:
    public static int heightTree(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightTree(root.left);
        int rigthHeight = heightTree(root.right);

        int height= Math.max(leftHeight,rigthHeight)+1;
        return height;
    }

    //count of node of tree:
    public static int totalNode(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = totalNode(root.left);
        int rightNode= totalNode(root.right);
        int count =leftNode+rightNode+1;

        return count;
    }

    //Sum of nodes:
    public static int sumNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum= sumNodes(root.right);
        int sum = leftSum + rightSum + root.data;
        return sum;
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("Preorder Sequence:");
        //First Way :
        tree.preorder(root);
        System.out.println();


        //Second Way:
        System.out.println("Inorder Sequence:");
        inorder(root);
        System.out.println();

        System.out.println("Postorder Sequence:");
        postorder(root);
        System.out.println();

        System.out.println("Level Order Sequence:");
        levelOrder(root);
        System.out.println();

        System.out.println("Height of the tree");
        System.out.println(heightTree(root));

        System.out.println("Total Node in BT");
        System.out.println(totalNode(root));

        System.out.println("Sum of the Nodes");
        System.out.println(sumNodes(root));
    }
}
