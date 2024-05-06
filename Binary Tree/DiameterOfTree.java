public class DiameterOfTree{
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int height = Math.max(leftHeight, rightHeight)+1;
        return height;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }

        int ldia=diameter(root.left);
        int rdia=diameter(root.right);
        int selfdia = height(root.left)+height(root.right)+1; //Passing from the root
        int maxDia=Math.max(selfdia,Math.max(ldia,rdia));

        return maxDia;
    }

    ////////////////////////// Apprach 2 ////////////////////////////

    static class Info{
        int diameter;
        int height;
        
        public Info(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }

    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diameter ,rightInfo.diameter),leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height ,rightInfo.height)+1;

        return new Info(diam,height);
    }

    public static void main(String args[]){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Diameter of the tree is :" + diameter(root));
        System.out.println("The diameter2 is :"+ diameter2(root).diameter);
    }
}