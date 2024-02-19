package Modul_3;
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(56);
        tree.insert(30);
        tree.insert(40);
        tree.insert(22);
        tree.insert(70);
        tree.insert(95);
        tree.insert(60);
        tree.insert(65);
        tree.insert(11);
        tree.insert(16);
        tree.insert(63);
        tree.insert(67);
        tree.insert(3);
        tree.insert(37);
        tree.insert(88);
              
        System.out.print("Pre Order: ");
        tree.preOrder(tree.getRoot());
        System.out.println();

        System.out.print("Post Order: ");
        tree.postOrder(tree.getRoot());
        System.out.println();

        System.out.print("In Order: ");
        tree.inOrder(tree.getRoot());
        System.out.println();

        System.out.print("Level Order: ");
        tree.levelOrder(tree.getRoot());
        System.out.println();

        int search1 = 16;
        if (tree.find(search1)) {
            System.out.println("Nilai yang di cari " + search1 + " ditemukan.");
        } else {
            System.out.println("Nilai yang di cari " + search1 + " tidak ditemukan.");
        }

        int search2 = 63;
        if (tree.find(search2)) {
            System.out.println("Nilai yang di cari " + search2 + " ditemukan.");
        } else {
            System.out.println("Nilai yang di cari " + search2 + " tidak ditemukan.");
        }
        
        
 
        int[] data = {60, 55, 100, 107, 67, 105, 57, 45, 59, 106, 43};

        for (int value : data) {
            tree.insert(value);
        }
        System.out.println("");
        System.out.println("Inorder Traversal sebelum penghapusan:");
        tree.inOrder(tree.getRoot());
        System.out.println();

        int[] keysToDelete = {100, 55, 60, 57, 67, 105, 106, 59};
        for (int key : keysToDelete) {
            System.out.println("");
            System.out.println("Menghapus node dengan nilai " + key + ":");
            tree.delete(key);
            tree.inOrder(tree.getRoot());
            System.out.println();
        }
    }
}

//        System.out.println("");
//        System.out.println("In Order sebelum penghapusan:");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        int[] nodesToDelete = {100, 63, 65, 60, 95, 88, 67, 70, 56, 22, 16, 11, 3, 30, 40, 37};
//
//        for (int node : nodesToDelete) {
//            System.out.println("");
//            System.out.println("Menghapus node dengan nilai " + node);
//            tree.delete(node);
//
//            System.out.println("In Order setelah menghapus node dengan nilai " + node + ":");
//            tree.inOrder(tree.getRoot());
//            System.out.println();
//        }
//    }
//}




 
//        
//        System.out.println("");
//        Boolean hasil = tree.delete(100);
//        if (hasil ==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(63);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(65);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//
//        System.out.println("");
//        hasil = tree.delete(60);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(95);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(88);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(67);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(70);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(56);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(22);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(16);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(11);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(3);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(30);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(40);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
//        
//        System.out.println("");
//        hasil = tree.delete(37);
//        if(hasil==true){
//            System.out.println("Berhasil Menghapus");
//            System.out.println("");
//        
//        }else{
//            System.out.println("Tidak Berhasil Menghapus");
//            System.out.println("");
//        }
//        System.out.println("InOrder");
//        tree.inOrder(tree.getRoot());
        
        
        
        
        

    





//        int search3 = 100;
//        if (tree.find(search3)) {
//            System.out.println("Angka " + search3 + " ditemukan.");
//        } else {
//            System.out.println("Angka " + search3 + " tidak ditemukan.");
//        }