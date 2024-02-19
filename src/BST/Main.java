/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BST;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new TreeNode(50);
        tree.root.left = new TreeNode(30);
        tree.root.right = new TreeNode(70);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(40);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(80);

        System.out.println("Nilai Minimum: " + tree.findMin());
        System.out.println("Nilai Maksimum: " + tree.findMax());

        TreeNode node = tree.root.left.right; // Contoh node
        TreeNode predecessor = tree.findPredecessor(node);
        if (predecessor != null) {
            System.out.println("Predecessor dari " + node.data + " adalah " + predecessor.data);
        } else {
            System.out.println("Node ini tidak memiliki predecessor.");
        }

        System.out.println("Ukuran Pohon: " + tree.getSize(tree.root));

        if (tree.isComplete()) {
            System.out.println("Pohon adalah complete tree.");
        } else {
            System.out.println("Pohon bukan complete tree.");
        }

        int height = tree.getHeight(node);
        System.out.println("Tinggi Node " + node.data + ": " + height);
    }
}