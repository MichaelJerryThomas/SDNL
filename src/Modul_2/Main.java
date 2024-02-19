package Modul_2;
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
    }
}

 

//        int search3 = 100;
//        if (tree.find(search3)) {
//            System.out.println("Angka " + search3 + " ditemukan.");
//        } else {
//            System.out.println("Angka " + search3 + " tidak ditemukan.");
//        }