package Tree.BinaryTreeArray;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTreeArray tree=new BinaryTreeArray(9);

        tree.insert("N1");
        tree.insert("N2");
        tree.insert("N3");
        tree.insert("N4");
        tree.insert("N5");
        tree.insert("N6");
        tree.insert("N7");
        tree.insert("N8");
        tree.insert("N9");
        System.out.println(" ");
        tree.delete("N3");
        tree.levelOrder();
    }



}
