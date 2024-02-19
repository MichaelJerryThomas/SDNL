/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BST;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    TreeNode root;

    public Tree() {
        root = null;
    }

    // 1. Mencari nilai minimum dan maksimum pohon
    public int findMin() {
        if (root == null) {
            System.out.println("Pohon kosong.");
            return -1;
        }
        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMax() {
        if (root == null) {
            System.out.println("Pohon kosong.");
            return -1;
        }
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // 2. Mencari predecessor dari sebuah node
    public TreeNode findPredecessor(TreeNode node) {
        if (node == null || root == null) {
            return null;
        }

        if (node.left != null) {
            TreeNode current = node.left;
            while (current.right != null) {
                current = current.right;
            }
            return current;
        } else {
            TreeNode predecessor = null;
            TreeNode current = root;
            while (current != node) {
                if (node.data < current.data) {
                    current = current.left;
                } else {
                    predecessor = current;
                    current = current.right;
                }
            }
            return predecessor;
        }
    }

    // 3. Menghitung size dari pohon
    public int getSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSize(node.left) + getSize(node.right);
    }

    // 4. Mengecek apakah pohon tersebut complete tree
    public boolean isComplete() {
        int size = getSize(root);
        return isCompleteUtil(root, 0, size);
    }

    private boolean isCompleteUtil(TreeNode node, int index, int size) {
        if (node == null) {
            return true;
        }
        if (index >= size) {
            return false;
        }
        return (isCompleteUtil(node.left, 2 * index + 1, size) && isCompleteUtil(node.right, 2 * index + 2, size));
    }

    // 5. Menghitung tinggi dari sebuah node
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}


