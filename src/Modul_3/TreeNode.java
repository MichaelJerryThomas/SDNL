package Modul_3;

public class TreeNode {
    int iData;
    TreeNode leftNode;
    TreeNode rightNode;
    
public TreeNode(int data) {
    this.iData = data;
    this.leftNode = null;
    this.rightNode = null;

} 
    public int getData() {
        return iData;
    }

    public void setData(int data) {
       this.iData = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode node) {
        this.leftNode = node;
    }
    public TreeNode getRightNode() {
        return rightNode;
    }
    public void setRightNode(TreeNode node) {
        this.rightNode = node;
    }
}


