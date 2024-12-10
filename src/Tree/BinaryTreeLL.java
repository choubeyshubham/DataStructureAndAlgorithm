package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {

    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    // Preorder traversal
    public void preOrder(BinaryNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);

    }

    //Inorder Traversal
    public void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }


    //Post Order Traversal
    public void postOrder(BinaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    //Level Order Traversal
    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+"->");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    //Binary Tree Search Level Order Traversal
    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value==value){
                System.out.println("The value->"+ value+" is found in Tree");
                return;
            }else {
                if (presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value->"+ value+" is not found in Tree");




    }



}
