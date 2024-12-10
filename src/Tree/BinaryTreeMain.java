package Tree;

public class BinaryTreeMain {
    /*
    Binary tree are the data structure in which each node
    has at most two children, often referred to as the left
    and right children

    Binary tree is  a family of data structure(BST, Heap Tree,
    AVL, red black trees, Syntax tree)

    Why Binary Tree?
    * Binary tree are a prerequisite for a mode advanced trees like
    BST, AVL, Red Black Trees

    Types of Binary Tree
    * Full Binary Tree
    * Perfect Binary Tree
    * Complete Binary Tree
    * Balanced Binary Tree

    */
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        BinaryNode N1= new BinaryNode();
        N1.value="N1";
        BinaryNode N2= new BinaryNode();
        N2.value="N2";
        BinaryNode N3= new BinaryNode();
        N3.value="N3";
        BinaryNode N4= new BinaryNode();
        N4.value="N4";
        BinaryNode N5= new BinaryNode();
        N5.value="N5";
        BinaryNode N6= new BinaryNode();
        N6.value="N6";
        BinaryNode N7= new BinaryNode();
        N7.value="N7";
        BinaryNode N8= new BinaryNode();
        N8.value="N8";
        BinaryNode N9= new BinaryNode();
        N9.value="N9";

        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N5;
        N3.left=N6;
        N3.right=N7;
        N4.left=N8;
        N4.right=N9;
        binaryTree.root=N1;

        binaryTree.search("N5");

        
    }






}
