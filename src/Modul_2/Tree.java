package Modul_2 ;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    private TreeNode root;

    public Tree() {
    }

    public TreeNode getRoot() {
        return root;

    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insert(int d) {
        TreeNode baru = new TreeNode(d);
        if (getRoot() == null) {
            setRoot(baru);
        } else {
            TreeNode parent = getRoot();
            TreeNode help = getRoot();
            while (help != null) {
                parent = help;
                if (d < help.getData()) {
                    help = help.getLeftNode();
                } else if (d >= help.getData()) {
                    help = help.getRightNode();

                }
            }

            if (d < parent.getData()) {

                parent.setLeftNode(baru);

            } else {

                parent.setRightNode(baru);
            }
        }
    }

    public boolean find(int s) {
        TreeNode baru = getRoot();
        if (baru == null) {
            return false;
        } else {
            while (baru != null) {
                if (baru.getData() == s) {
                    return true;
                } else if (s < baru.getData()) {
                    baru = baru.getLeftNode();
                } else if (s > baru.getData()) {
                    baru = baru.getRightNode();

                }
            }
            return false;

        }

    }

    public TreeNode search(int s) {
        TreeNode baru = getRoot();
        if (baru == null) {
            return null;
        } else {
            while (baru != null) {
                if (baru.getData() == s) {
                    return baru;
                } else if (s < baru.getData()) {
                    baru = baru.getLeftNode();
                } else if (s > baru.getData()) {
                    baru = baru.getRightNode();
                }
            }
            return null;
        }
    }
    
 
    public void preOrder(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preOrder(localRoot.getLeftNode());
            preOrder(localRoot.getRightNode());
        }
    }

    public void inOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inOrder(localRoot.getRightNode());
        }
    }

    public void postOrder(TreeNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.getLeftNode());
        
        postOrder(localRoot.getRightNode());
        System.out.print(localRoot.getData() + " ");
    }
 }
    

    public void levelOrder(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {            
            TreeNode node = queue.poll();
            System.out.print(node.getData()+" ");
            
            if (node.getLeftNode() != null) {
                queue.add(node.getLeftNode());
            } 
            
            if (node.getRightNode() != null) {
                queue.add(node.getRightNode());
            }
        }
    }
    public TreeNode delete (int data) {   
        TreeNode temp = this.root;
        TreeNode parent = this.root;
        
        while(temp != null) {
            if(data < temp.getData()) {
                parent = temp;
                temp = temp.getLeftNode();
            } else if(data > temp.getData()) {
                parent = temp;
                temp = temp.getRightNode();
            } else {
                if(temp.getLeftNode()==null && temp.getRightNode()==null) {
                    if(data < parent.getData()) {
                        parent.setLeftNode(null);
                    } else {
                        parent.setRightNode(null);
                    }
                } else if(temp.getLeftNode()==null && temp.getRightNode()!=null) {
                    if(data < parent.getData()) {
                        parent.setLeftNode(temp.getRightNode());
                        return temp.getRightNode();
                    } else {
                        parent.setRightNode(temp.getRightNode());
                        return temp.getRightNode();
                    }
                } else if(temp.getLeftNode()!=null && temp.getRightNode()==null) {
                    if(data < parent.getData()) {
                        parent.setLeftNode(temp.getLeftNode());
                        return temp.getLeftNode();
                    } else {
                        parent.setRightNode(temp.getLeftNode());
                        return temp.getLeftNode();
                    }
                }
                return temp;
            }
        }
        return null;    
    }
}






