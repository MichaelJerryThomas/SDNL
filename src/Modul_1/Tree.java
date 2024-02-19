package Modul_1;
public class Tree {
    private TreeNode root;

    public Tree() {
        this.root = null;
    }
    public void insert(int data) {
       TreeNode baru = new TreeNode (data);
       
       if (root==null){
           root=baru;
       }else{
           TreeNode bantu = root;
           while(true){
               if(baru.getiData()<bantu.getiData()){
                   if(bantu.getLeftNode()==null){
                       bantu.setLeftNode(baru);
                       return;
                   }else{
                       bantu=bantu.getLeftNode();
                   }
                   
               }else{
                   if(bantu.getRightNode()==null){
                       bantu.setRightNode(baru);
                       return;
                       
                   }else{
                       bantu=bantu.getRightNode();
                   }
               }
           }
    
       }
    }
}






