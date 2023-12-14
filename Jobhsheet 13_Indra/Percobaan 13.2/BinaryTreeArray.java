public class BinaryTreeArray {
    int[] data;
    int idxLast, anchor = 0;

    public BinaryTreeArray(){
        data = new int[10];
        idxLast = -1;
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void add(int dt){
        if (idxLast == data.length - 1) {
            System.out.println("Binary tree is full!");
            return;
        }
        idxLast++;
        data[idxLast] = dt;
    }

    public void traversePreOrder(int idxStart){
        if (idxStart <= idxLast && data[idxStart] != 0) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    public void traversePostOrder(int idxStart){
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
