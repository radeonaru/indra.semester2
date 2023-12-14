public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        // int[] data = {6,4,8,3,5,7,9,0,0,0};
        // int idxLast = 6;
        // bta.populateData(data, idxLast);
        // bta.traverseInOrder(0);

        bta.add(4);
        bta.add(7);
        bta.add(10);
        bta.add(2);
        bta.add(5);
        bta.add(9);

        System.out.println("Traverse In Order :");
        bta.traverseInOrder(0);

        System.out.println("\nTraverse Post Order :");
        bta.traversePostOrder(0);

        System.out.println("\nTraverse Pre Order :");
        bta.traversePreOrder(0);

    }
}
