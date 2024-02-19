package Modul_4 ;
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
    
    public boolean delete(int data){
        TreeNode parent = root;
        TreeNode temp = root;
        
        while(temp != null){
            if (data < temp.getData()) {
                parent = temp;
                temp = temp.getLeftNode();
            } else if (data > temp.getData()) {
                parent = temp;
                temp = temp.getRightNode();
            } else {
                if (temp.getLeftNode()== null && temp.getRightNode()== null) {
                    if (data < parent.getData()) {
                        parent.setLeftNode(null);
                    } else if (data > parent.getData()){
                        parent.setRightNode(null);
                    } else {
                        root = null;
                    }          
                } else if (temp.getLeftNode()== null && temp.getRightNode() != null) {
                    if (data < parent.getData()) {
                        parent.setLeftNode(temp.getRightNode());
                    } else if (data > parent.getData()) {
                        parent.setRightNode(temp.getRightNode());
                    } else {
                        root = temp.getRightNode();
                    }
                } else if (temp.getLeftNode() != null && temp.getRightNode() == null) {
                    if (data < parent.getData()) {
                        parent.setLeftNode(temp.getLeftNode());
                    } else if (data > parent.getData()) {
                        parent.setRightNode(temp.getLeftNode());
                    } else {
                        root = temp.getLeftNode();
                    }
                } else if (temp.getLeftNode() != null && temp.getRightNode() != null) {
                    TreeNode successor = successor(temp);
                    if (temp == root) {
                        root = successor;
                    } else if (temp == parent.getLeftNode()) {
                        parent.setLeftNode(successor);
                    } else{
                        parent.setRightNode(successor);
                    }
                    successor.setLeftNode(temp.getLeftNode());
                }
                return true;
            }
        }
        return false;
    }
    
    public TreeNode successor(TreeNode node) {
        TreeNode successor = null;
        TreeNode successorParent = null;
        TreeNode temp = node.getRightNode();
        while (temp != null) {
            successorParent = successor;
            successor = temp;
            temp = temp.getLeftNode();
        } if (successor != node.getRightNode()) {
            successorParent.setLeftNode(successor.getRightNode());
            successor.setRightNode(node.getRightNode());
        }
        return successor;
    }
}




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


    






