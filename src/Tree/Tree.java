package Tree;

import java.util.HashMap;
import java.util.Map;

public class Tree {
    /*
        A tree is non-linear data structure with hierarical relationship between its elements
        without having any cycle, it is basically reversed from real life tree

        Why tree?
        quicker and easier to access data
        Store Hierarchical data, like folder structure, organization structure, XML, HTML Data
        There are many types of data structure which perform better on various situation
            -Binary Search Tree, AVL, Red Black Tree, Trie

        Terminology
        * Root: top node without parent
        * Edge: a link between parent and child
        * Leaf: a node that does not have children
        * Sibling: children of same parent
        * Ancestor: Parent, grandparent, great grandparent of a node
        * Depth of Node: a lenght of a path from root to node
        * Height of Node: a length of path from node to the deepest node
        * Depth of tree: depth of root node
        * hieght of tree: height of root node
     */

    public static void main(String[] args) {

        TreeNode drinks= new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        //child of Hot
        TreeNode tea= new TreeNode("Drinks");
        TreeNode coffee = new TreeNode("Hot");
        //child of cold
        TreeNode coke = new TreeNode("Coke");
        TreeNode fanta = new TreeNode("Fanta");
        //
        drinks.addChild(cold);
        drinks.addChild(hot);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(coke);
        cold.addChild(fanta);

        System.out.println(drinks.print(0));
//        System.out.println(drinks.print(1));

    }


}
