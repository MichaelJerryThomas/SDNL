package Modul_6;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(60);
        tree.insert(55);
        tree.insert(100);
        tree.insert(107);
        tree.insert(67);
        tree.insert(105);
        tree.insert(57);
        tree.insert(45);
        tree.insert(59);
        tree.insert(106);
        tree.insert(43);

        // 1. Mencari nilai minimum dan maksimum pohon
        int min = tree.findMin();
        int max = tree.findMax();
        System.out.println("Nilai Minimum: " + min);
        System.out.println("Nilai Maksimum: " + max);

        // 2. Mencari predecessor dari sebuah node
        int nodeValue = 67; // Ganti dengan nilai node yang ingin kita cari predecessor-nya
        TreeNode node = tree.search(nodeValue);
        TreeNode predecessor = tree.findPredecessor(node);
        if (predecessor != null) {
            System.out.println("Predecessor dari " + nodeValue + " adalah " + predecessor.getData());
        } else {
            System.out.println("Node ini tidak memiliki predecessor.");
        }

        // 3. Menghitung size dari pohon
        int size = tree.getSize(tree.getRoot());
        System.out.println("Ukuran Pohon: " + size);

        // 4. Mengecek apakah pohon tersebut complete tree atau bukan complete tree
        if (tree.isComplete()) {
            System.out.println("Pohon adalah complete tree.");
        } else {
            System.out.println("Pohon bukan complete tree.");
        }

        // 5. Menghitung tinggi dari sebuah node
        int nodeHeight = tree.getHeight(node);
        System.out.println("Tinggi Node " + nodeValue + ": " + nodeHeight);
    }
}

    
        
        
        
  
    
//        Tree tree = new Tree();
//        tree.insert(60);
//        tree.insert(55);
//        tree.insert(100);
//        tree.insert(107);
//        tree.insert(67);
//        tree.insert(105);
//        tree.insert(57);
//        tree.insert(45);
//        tree.insert(59);
//        tree.insert(106);
//        tree.insert(43);
//
//        // Tampilkan nilai minimum dan maksimum
//        System.out.println("Nilai Minimum: " + tree.findMin());
//        System.out.println("Nilai Maksimum: " + tree.findMax());
//
//        // Cek apakah pohon adalah complete tree
//        System.out.println("Apakah pohon adalah complete tree: " + tree.isComplete());
//
//        // Hitung dan tampilkan ukuran pohon
//        System.out.println("Ukuran pohon: " + tree.size());
//
//        // Hitung dan tampilkan tinggi dari pohon
//        System.out.println("Tinggi pohon: " + tree.height(tree.getRoot()));
//    }
//}
        
//        System.out.println("In order Traversal sebelum penghapusan: ");
//        tree.inOrder(tree.getRoot());
//        System.out.println();
//        
//        System.out.println("");
//        tree.delete(100);
//        System.out.println("Menghapus 100:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//        
//        tree.delete(55);
//        System.out.println("Menghapus 55:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//        
//        tree.delete(60);
//        System.out.println("Menghapus 60:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//        
//        tree.delete(57);
//        System.out.println("Menghapus 57:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//        
//        tree.delete(67);
//        System.out.println("Menghapus 67:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//        
//        tree.delete(105);
//        System.out.println("Menghapus 105:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//        
//        tree.delete(106);
//        System.out.println("Menghapus 106:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//        
//        tree.delete(59);
//        System.out.println("Menghapus 59:");
//        tree.inOrder(tree.getRoot());
//        System.out.println("");
//    }

 



//        System.out.print("Pre Order: ");
//        tree.preOrder(tree.getRoot());
//        System.out.println();
//
//        System.out.print("Post Order: ");
//        tree.postOrder(tree.getRoot());
//        System.out.println();
//
//        System.out.print("In Order: ");
//        tree.inOrder(tree.getRoot());
//        System.out.println();
//
//        System.out.print("Level Order: ");
//        tree.levelOrder(tree.getRoot());
//        System.out.println();
//
//        int search1 = 16;
//        if (tree.find(search1)) {
//            System.out.println("Nilai yang di cari " + search1 + " ditemukan.");
//        } else {
//            System.out.println("Nilai yang di cari " + search1 + " tidak ditemukan.");
//        }
//
//        int search2 = 63;
//        if (tree.find(search2)) {
//            System.out.println("Nilai yang di cari " + search2 + " ditemukan.");
//        } else {
//            System.out.println("Nilai yang di cari " + search2 + " tidak ditemukan.");
//        }
//        
//        int[] data = {60, 55, 100, 107, 67, 105, 57, 45, 59, 106, 43};
//
//        for (int value : data) {
//            tree.insert(value);
//        }
//        System.out.println("");
//        System.out.println("Inorder Traversal sebelum penghapusan:");
//        tree.inOrder(tree.getRoot());
//        System.out.println();
//
//        int[] keysToDelete = {100, 55, 60, 57, 67, 105, 106, 59};
//        for (int key : keysToDelete) {
//            System.out.println("");
//            System.out.println("Menghapus node dengan nilai " + key + ":");
//            tree.delete(key);
//            tree.inOrder(tree.getRoot());
//            System.out.println();
//        }
//    }
//    }
//}

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