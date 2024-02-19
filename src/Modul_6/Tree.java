package Modul_6;

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

    public void levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.getData() + " ");

            if (node.getLeftNode() != null) {
                queue.add(node.getLeftNode());
            }

            if (node.getRightNode() != null) {
                queue.add(node.getRightNode());
            }
        }
    }

//    public boolean delete(int data) {
//        TreeNode parent = root;
//        TreeNode temp = root;
//
//        while (temp != null) {
//            if (data < temp.getData()) {
//                parent = temp;
//                temp = temp.getLeftNode();
//            } else if (data > temp.getData()) {
//                parent = temp;
//                temp = temp.getRightNode();
//            } else {
//                if (temp.getLeftNode() == null && temp.getRightNode() == null) {
//                    if (data < parent.getData()) {
//                        parent.setLeftNode(null);
//                    } else if (data > parent.getData()) {
//                        parent.setRightNode(null);
//                    } else {
//                        root = null;
//                    }
//                } else if (temp.getLeftNode() == null && temp.getRightNode() != null) {
//                    if (data < parent.getData()) {
//                        parent.setLeftNode(temp.getRightNode());
//                    } else if (data > parent.getData()) {
//                        parent.setRightNode(temp.getRightNode());
//                    } else {
//                        root = temp.getRightNode();
//                    }
//                } else if (temp.getLeftNode() != null && temp.getRightNode() == null) {
//                    if (data < parent.getData()) {
//                        parent.setLeftNode(temp.getLeftNode());
//                    } else if (data > parent.getData()) {
//                        parent.setRightNode(temp.getLeftNode());
//                    } else {
//                        root = temp.getLeftNode();
//                    }
//                } else if (temp.getLeftNode() != null && temp.getRightNode() != null) {
//                    TreeNode successor = successor(temp);
//                    if (temp == root) {
//                        root = successor;
//                    } else if (temp == parent.getLeftNode()) {
//                        parent.setLeftNode(successor);
//                    } else {
//                        parent.setRightNode(successor);
//                    }
//                    successor.setLeftNode(temp.getLeftNode());
//                } else if (temp.getRightNode() != null && temp.getLeftNode() != null) {
//                    TreeNode predecessor = predecessor(temp);
//                    if (temp == root) {
//                        root = predecessor;
//                    } else if (temp == parent.getRightNode()) {
//                        parent.setRightNode(predecessor);
//                    } else {
//                        parent.setRightNode(predecessor);
//                    }
//                    predecessor.setLeftNode(temp.getLeftNode());
//
//                }
//                return true;
//            }
//
//        }
//        return false;
//    }

//    public TreeNode successor(TreeNode node) {
//        TreeNode successor = null;
//        TreeNode successorParent = null;
//        TreeNode temp = node.getRightNode();
//        while (temp != null) {
//            successorParent = successor;
//            successor = temp;
//            temp = temp.getLeftNode();
//        }
//        if (successor != node.getRightNode()) {
//            successorParent.setLeftNode(successor.getRightNode());
//            successor.setRightNode(node.getRightNode());
//        }
//        return successor;
//    }

//    public int findMin() {
//    TreeNode current = getRoot();
//    while (current.getLeftNode() != null) {
//        current = current.getLeftNode();
//    }
//    return current.getData();
//}
//
//public int findMax() {
//    TreeNode current = getRoot();
//    while (current.getRightNode() != null) {
//        current = current.getRightNode();
//    }
//    return current.getData();
//}
//
//
//    public TreeNode predecessor(TreeNode node) {
//        TreeNode predecessor = null;
//        TreeNode predecessorParent = null;
//        TreeNode temp = node.getLeftNode();
//        while (temp != null) {
//            predecessorParent = predecessor;
//            predecessor = temp;
//            temp = temp.getLeftNode();
//        }
//        if (predecessor != node.getLeftNode()) {
//            predecessorParent.setLeftNode(predecessor.getLeftNode());
//            predecessor.setLeftNode(node.getLeftNode());
//        }
//        return predecessor;
                
       

    // 1. Mencari nilai minimum dan maksimum pohon
    public int findMin() {
        TreeNode current = getRoot();
        if (current == null) {
            return Integer.MIN_VALUE; // Return nilai minimum yang mungkin
        }

        while (current.getLeftNode() != null) {
            current = current.getLeftNode();
        }
        return current.getData();
    }

    public int findMax() {
        TreeNode current = getRoot();
        if (current == null) {
            return Integer.MAX_VALUE; // Return nilai maksimum yang mungkin
        }

        while (current.getRightNode() != null) {
            current = current.getRightNode();
        }
        return current.getData();
    }

    // 2. Mencari predecessor dari sebuah node
    public TreeNode findPredecessor(TreeNode node) {
        if (node == null || getRoot() == null) {
            return null;
        }

        TreeNode current = getRoot();
        TreeNode predecessor = null;

        while (current != null) {
            if (node.getData() == current.getData()) {
                break;
            } else if (node.getData() < current.getData()) {
                current = current.getLeftNode();
            } else {
                predecessor = current;
                current = current.getRightNode();
            }
        }

        if (current == null) {
            return null; // Node tidak ditemukan
        }

        if (current.getLeftNode() != null) {
            TreeNode temp = current.getLeftNode();
            while (temp.getRightNode() != null) {
                temp = temp.getRightNode();
            }
            return temp;
        } else {
            return predecessor;
        }
    }

    // 3. Menghitung size dari pohon
    public int getSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSize(node.getLeftNode()) + getSize(node.getRightNode());
    }

    // 4. Mengecek apakah pohon tersebut complete tree
    public boolean isComplete() {
        return isComplete(getRoot(), 0, getSize(getRoot()));
    }

    private boolean isComplete(TreeNode node, int index, int size) {
        if (node == null) {
            return true;
        }

        if (index >= size) {
            return false;
        }

        return (isComplete(node.getLeftNode(), 2 * index + 1, size) && isComplete(node.getRightNode(), 2 * index + 2, size));
    }

    // 5. Menghitung tinggi dari sebuah node
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.getLeftNode());
        int rightHeight = getHeight(node.getRightNode());

        return Math.max(leftHeight, rightHeight) + 1;
    }
}














//public int size() {
//    return size(getRoot());
//}
//
//private int size(TreeNode node) {
//    if (node == null) {
//        return 0;
//    }
//    return size(node.getLeftNode()) + 1 + size(node.getRightNode());
//}
//public boolean isComplete() {
//    return isComplete(getRoot(), 0, size());
//}
//
//private boolean isComplete(TreeNode node, int index, int size) {
//    if (node == null) {
//        return true;
//    }
//
//    if (index >= size) {
//        return false;
//    }
//
//    return isComplete(node.getLeftNode(), 2 * index + 1, size)
//            && isComplete(node.getRightNode(), 2 * index + 2, size);
//}
//public int height(TreeNode node) {
//    if (node == null) {
//        return -1;
//    }
//    int leftHeight = height(node.getLeftNode());
//    int rightHeight = height(node.getRightNode());
//    return Math.max(leftHeight, rightHeight) + 1;
//}
//}







//public TreeNode findPredecessor(TreeNode node) {
//    if (node == null) {
//        return null;
//    }
//
//    if (node.getLeftNode() != null) {
//        TreeNode current = node.getLeftNode();
//        while (current.getRightNode() != null) {
//            current = current.getRightNode();
//        }
//        return current;
//    } else {
//        TreeNode predecessor = null;
//        TreeNode current = getRoot();
//        while (current != node) {
//            if (node.getData() < current.getData()) {
//                current = current.getLeftNode();
//            } else {
//                predecessor = current;
//                current = current.getRightNode();
//            }
//        }
//        return predecessor;
//    }
//}

//    public int size(TreeNode node) {
//        if (node == null) {
//            return 0;
//        } else {
//            int leftSize = size(node.getLeftNode());
//            int rightSize = size(node.getRightNode());
//            return leftSize + rightSize + 1;
//        }
//    }
//
//    public int size() {
//        return size(getRoot());
//    }
//
//}

//    public boolean delete(int data) {
//        TreeNode temp = this.root;
//        TreeNode parent = this.root;
//
//        while (temp != null) {
//            if (data < temp.getData()) {
//                parent = temp;
//                temp = temp.getLeftNode();
//            } else if (data > temp.getData()) {
//                parent = temp;
//                temp = temp.getRightNode();
//            } else {
//
//                if (temp.getLeftNode() == null && temp.getRightNode() == null) {
//
//                    if (data < parent.getData()) {
//                        parent.setLeftNode(null);
//                    } else if (data > parent.getData()) {
//                        parent.setRightNode(null);
//                    } else {
//                        root = null;//hapus kanan
//                    }
//                } else if (temp.getLeftNode() == null && temp.getRightNode() != null) {
//                    if (data < parent.getData()) {
//                        parent.setLeftNode(temp.getRightNode());
//                    } else if (data > parent.getData()) {
//                        parent.setRightNode(temp.getRightNode());
//
//                    } else {
//                        root = temp.getRightNode();
//                        parent = temp.getRightNode();
//                    }
//                } else if (temp.getLeftNode() != null && temp.getRightNode() == null) {
//                    if (data > parent.getData()) {
//                        parent.setRightNode(temp.getLeftNode());
//                    } else if (data < parent.getData()) {
//                        parent.setLeftNode(temp.getLeftNode());
//                    } else {
//                        root = temp.getLeftNode();
//                        parent = temp.getLeftNode();
//                    }
//                } else if (temp.getLeftNode() != null && temp.getRightNode() != null) {
//                    TreeNode successor = temp.getRightNode();
//                    TreeNode parentSuccessor = successor;
//                    while (successor.getLeftNode() != null){
//                        parentSuccessor = successor;
//                        successor = successor.getLeftNode();
//                    }
//                    temp.setData(successor.getData());
//                    
//                    if (parentSuccessor == successor) {
//                        temp.setRightNode(null);
//                    }
//                    else if (successor.getRightNode() != null) {
//                        parentSuccessor.setLeftNode(successor.getRightNode());
//                    }
//                    else {
//                        parentSuccessor.setLeftNode(null);
//                    }
//                }
//
//                return true;
//            }
//
//        }
//        return false;
//    }
//}
//    
//    public boolean delete(int key) {
//        TreeNode parent = null; 
//        TreeNode current = getRoot(); 
//
//        while (current != null) {
//        if (key == current.getData()) {
//            
//            if (current.getLeftNode() == null && current.getRightNode() == null) {
//                if (parent == null) {
//                    setRoot(null); 
//                } else if (key < parent.getData()) {
//                    parent.setLeftNode(null);
//                } else {
//                    parent.setRightNode(null);
//                }
//                return true;
//            }
//
//            else if (current.getLeftNode() == null) {
//                if (parent == null) {
//                    setRoot(current.getRightNode()); 
//                } else if (key < parent.getData()) {
//                    parent.setLeftNode(current.getRightNode());
//                } else {
//                    parent.setRightNode(current.getRightNode());
//                }
//                return true;
//                
//            } else if (current.getRightNode() == null) {
//                if (parent == null) {
//                    setRoot(current.getLeftNode()); 
//                } else if (key < parent.getData()) {
//                    parent.setLeftNode(current.getLeftNode());
//                } else {
//                    parent.setRightNode(current.getLeftNode());
//                }
//                return true;
//            }
//
//        } else if (key < current.getData()) {
//            parent = current;
//            current = current.getLeftNode();
//        } else {
//            parent = current;
//            current = current.getRightNode();
//            
//    }
//    
//    return false; 
//}
//    
//    public Boolean Delete(int key) {
//        TreeNode parent = getRoot(); 
//        TreeNode temp = getRoot();
//
//        while (temp != null) {
//            if (key < temp.getData())
//            parent = temp;
//            temp = temp.getLeftNode(); 
//            
//                     
//            } else if (key > temp.getData()) {
//                parent = temp;
//                temp = temp.getRightNode();
//
//            } else {
//                if (temp.getLeftNode()== null && temp.getRightNode()== null) {
//                    if (key parent.getData()) { 
//                    parent.setLeftNode(null);
//                
//                } else if(key > parent.getiData()) { 
//                    parent.getRightNode(null);
//                        }
//
//                }else{
//                    root=null;
//                }
//
//                } else if (temp.getLeftNode()== null && temp.getRightNode()!= null) {
//
//                    if (key parent.getData()) { 
//                        parent.setLeftNode( temp.getRightNode());
//
//                    } else if(key>parent.getData()) { 
//                        parent.setRightNode(temp.getRightNode());
//                    
//                    }else{
//                        parent = temp.getRightNode()
//                        root = temp.getRightNode()
//                    }
//                }
//                else if(temp.getLeftNode()!null && temp.getRightNode()==null){
//                    if (key<parent.getData()) {
//                   //kondisi 4 punya anak kiri dari anak kiri
//                    parent.setRightNode(temp.getLeftNode()); 
//                     }else if(key>parent.getData()) {
//                    //kondisi 4 punya anak kanan dari anak kiri
//                    parent.setRightNode(temp.getLeftNode());
//                    
//                     }else{
//                         parent=temp.getLeftNode();
//                         root=temp.getLeftNode();
//                     }
//        }
//                return true;
//                
//        }
//    }
//    return false;
//}
//    public boolean delete(int data) {
//
//        TreeNode current = root;
//        TreeNode parent = null;
//        while (current.getData() != data) {
//
//            parent = current;
//
//            if (data < current.getData()) {
//                current = current.getLeftNode();
//            } else if (data > current.getData()) {
//                current = current.getRightNode();
//            }
//            if (current == null) {
//
//                return false;
//
//            }
//        }
//        if (current.getLeftNode() == null && current.getRightNode() == null) {
//
//            if (current == root) {
//                root = null;
//
//            } else if (current == parent.getLeftNode()) {
//                parent.setLeftNode(null);
//
//            } else if (current == parent.getRightNode()) {
//
//                parent.setRightNode(null);
//
//            }
//            return true;
//
//        } else if (current.getRightNode() == null && current.getLeftNode() != null) {
//            if (current == root) {
//
//                root = current.getLeftNode();
//            } else if (current == parent.getLeftNode()) {
//
//                parent.setLeftNode(current.getLeftNode()
//                );
//            } else if (current == parent.getRightNode()) {
//                parent.setRightNode(current.getLeftNode());
//            }
//        }
//        return true;
//    }
//}
//private TreeNode getSuccessor(TreeNode node) {
//    TreeNode successorParent = node;
//    TreeNode successor = node;
//    TreeNode current = node.getRightNode();
//
//    while (current != null) {
//        successorParent = successor;
//        successor = current;
//        current = current.getLeftNode();
//    }
//
//    if (successor != node.getRightNode()) {
//        successorParent.setLeftNode(successor.getRightNode());
//        successor.setRightNode(node.getRightNode());
//    }
//
//    return successor;

