public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println("\nTraverse Pre Order : ");
        bt.traversePreOrder(bt.root);
        System.out.println("\nTraverse In Order :");
        bt.traverseInOrder(bt.root);
        System.out.println("\nTraverse Post Order : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find : " + bt.find(5));
        System.out.println("Delete (8) :");
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("Nilai terbesar : " + bt.show(1));
        System.out.println("Nilai terkecil : " + bt.show(2));

        System.out.println("Leaf : ");
        bt.getLeaf(bt.root);
        System.out.println("\nJumlah leaf : " + bt.getCountLeaf());

    }
}
