public class Fungsi {
    //-- Main with menu Option --

    // String back;
    // do {
    //         System.out.println("");
    //         System.out.println("");
    //         System.out.println("");
    //         System.out.println("\n1.\n2.\n3.\n4.\n5.\n6.");
    //         System.out.print("");
    //         int menu = sc.nextInt();

    //         switch (menu) {
    //             case 1:
    //                 
    //                 //Input Methode

    //                 System.out.println("Input");
    //                 String input = sc.next();

    //                 System.out.printf("%-15s %-40s %-20s\n", "Kode", "Mata Kuliah", "SKS");
    //                  
    //                  //Searching Alternate
    //
    //                 for (int i = 0; i < m.size(); i++) {
    //                     if (nim.equals(m.get(i).nim)) {
    //                         idxMhs = i;
    //                     }
    //                 }
    //                 for (int i = 0; i < mk.size(); i++) {
    //                     if (kode.equals(mk.get(i).kode)) {
    //                         idxMk = i;
    //                     }
    //                 }

    //                 Nilai nilaiMhs = new Nilai(kodeNilai, m.get(idxMhs).nim, m.get(idxMhs).nama, mk.get(idxMk).matkul,
    //                         mk.get(idxMk).sks,
    //                         dataNilai);
    //                 nilaiList.add(nilaiMhs);
    //                 break;

    //             case 2:
    //                 break;

    //             case 3:            
    //                 break;

    //             case 4:
    //                 break;

    //             case 5:
    //                 break;

    //             case 6:
    //                 System.out.println("Anda Keluar dari program!");
    //                 return;

    //         }
    //         System.out.println("Kembali ke menu? (y/t)");
    //         back = sc.next();
    //     } while (back.equalsIgnoreCase("y"));
    // }
    
    
    //J5 Sorting
    //Class : Daftar Mahasiswa Berprestasi (With class mahasiswa)
    // mahasiswa listMhs[] = new mahasiswa[5];
    // int idx;

    // void tambah(mahasiswa m){
    //     if(idx<listMhs.length){
    //         listMhs[idx] = m;
    //         idx++;
    //     }
    //     else {
    //         System.out.println("Data sudah penuh!");
    //     }
    // }

    // void tampil(){
    //     for (mahasiswa m : listMhs) {
    //         m.tampil();
    //         System.out.println("------------------------");
    //     }
    // }

    // void bubbleSort(){
    //     for (int i=0; i<listMhs.length-1; i++){
    //         for (int j=1; j<listMhs.length-i; j++){
    //             if (listMhs[j].ipk > listMhs[j-1].ipk){
    //                 mahasiswa tmp = listMhs[j];
    //                 listMhs[j] = listMhs[j-1];
    //                 listMhs[j-1] = tmp;
    //             }
    //         }
    //     }
    // }

    // void selectionSort(){
    //     for (int i = 0; i< listMhs.length-1; i++){
    //         int idxMin = i;
    //         for (int j=i+1; j<listMhs.length; j++){
    //             if (listMhs[j].ipk< listMhs[idxMin].ipk){
    //                 idxMin = j;
    //             }
    //         }
    //         mahasiswa tmp = listMhs[idxMin];
    //         listMhs[idxMin] = listMhs[i];
    //         listMhs [i] = tmp;
    //     }
    // }

    // void insertionSort(){
    //     for (int i = 1; i < listMhs.length; i++){
    //         mahasiswa temp = listMhs[i];
    //         int j = i;
    //         while (j > 0 && listMhs[j - 1].ipk < temp.ipk){
    //             listMhs[j] = listMhs [j-1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }
    
    
    //J6 Searching
    //Class : pencarianMhs (With class mahasiswa)
    // mahasiswa listMhs [] = new mahasiswa[5];
    // int idx;

    // void tambah (mahasiswa m) {
    //     if (idx < listMhs.length) {
    //         listMhs[idx] = m;
    //         idx++;
    //     } else {
    //         System.out.println("Data sudah penuh!");
    //     }
    // }

    // void tampil () {
    //     for (mahasiswa m : listMhs) {
    //         m.tampil();
    //         System.out.println("-----------------------------");
    //     }
    // }

    // public int FindReqSearch (String cari){
    //     int posisi = -1;
    //     int duplikat = 0;
    //     for (int j = 0; j < listMhs.length; j++){
    //         if (listMhs[j].nama.toLowerCase().contains(cari.toLowerCase())){
    //             posisi = j;
    //             duplikat++;
    //         }
    //     }
    //     if (duplikat>1){
    //         System.out.println("!!! Mahasiswa dengan nama " + cari + " Ditemukan lebih dari satu data!");
    //         System.out.println("Note : Data dengan posisi index terbawah akan ditampilkan");
    //     }
    //     return posisi;
    // }

    // public int FindBinarySearch (int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right)/2;
    //         if (cari == listMhs[mid].nim) {
    //             return (mid);
    //         } else if (listMhs[mid].nim > cari){
    //             return FindBinarySearch(cari, left, mid-1);
    //         } else {
    //             return FindBinarySearch(cari, mid+1, right);
    //         }
    //     }
    //     return -1;
    // }

    // public void Tampilposisi (int x, int pos) {
    //     if (pos!=-1) {
    //         System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
    //     } else {
    //         System.out.println("Data " + x + " tidak ditemukan");
    //     }
    // }

    // public void tampilData (int x, int pos) {
    //     if (pos != -1) {
    //         System.out.println("Nim\t : " + x);
    //         System.out.println("Nama\t : " + listMhs[pos].nama);
    //         System.out.println("Umur\t : " + listMhs[pos].umur);
    //         System.out.println("Ipk\t : " + listMhs[pos].ipk);
    //     } else {
    //         System.out.println("Data " + x + " tidak ditemukan");
    //     }
    // }

    // public void TampilPosisiNama (String x, int pos) {
    //     if (pos!=-1) {
    //         System.out.println("Nama : " + x + " ditemukan pada indeks " + pos);
    //     } else {
    //         System.out.println("Nama " + x + " tidak ditemukan");
    //     }
    // }

    // public void TampilDataNama (String x, int pos) {
    //     if (pos != -1) {
    //         System.out.println("Nim\t : " + listMhs[pos].nim);
    //         System.out.println("Nama\t : " + listMhs[pos].nama);
    //         System.out.println("Umur\t : " + listMhs[pos].umur);
    //         System.out.println("Ipk\t : " + listMhs[pos].ipk);
    //     } else {
    //         System.out.println("Data " + x + " tidak ditemukan");
    //     }
    // }

    // public void mergeSort() {
    //     sort(0, listMhs.length-1);
    // }

    // private void merge (int left, int middle, int right) {
    //     mahasiswa[] temp = new mahasiswa[listMhs.length];
    //     for (int i = left; i <= right; i++) {
    //         temp[i] = listMhs[i];
    //     }
    //     int a = left;
    //     int b = middle + 1;
    //     int c = left;

    //     while (a <= middle && b <= right) {
    //         if (temp[a].nim <= temp[b].nim){
    //             listMhs[c] = temp[a];
    //             a++;
    //         } else {
    //             listMhs[c] = temp[b];
    //             b++;
    //         }
    //         c++;
    //     }
    //     int s = middle - a;
    //     for (int i=0; i <= s; i++){
    //         listMhs [c+i] = temp [a+i];
    //     }
    // }

    // private void sort(int left, int right) {
    //     if (left < right){
    //         int middle = (left + right)/2;
    //         sort(left, middle);
    //         sort(middle+1, right);
    //         merge(left, middle, right);
    //     }
    // } 
    
    
    //J7 Stack
    //Class : Stack (With Pakaian Class)
    // int size;
    // int top;
    // int min;
    // Pakaian data[];

    // public Stack (int size){
    //     this.size = size;
    //     data = new Pakaian[size];
    //     top =-1;
    // }

    // public boolean IsEmpty() {
    //     if (top == -1) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public boolean IsFull() {
    //     if (top == size - 1) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public void push (Pakaian pkn) {
    //     if (!IsFull()) {
    //         top++;
    //         data[top] = pkn;
    //     } else {
    //         System.out.println("Isi stack penuh!");
    //     }
    // }

    // public void pop () {
    //     if (!IsEmpty()) {
    //         Pakaian x = data[top];
    //         top--;
    //         System.out.println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
    //     } else {
    //         System.out.println("Stack masih kosong!");
    //     }
    // }

    // public void peek() {
    //     System.out.println("Elemen teratas : " + data[top].jenis + " " + data[top].warna +
    //     " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    // }

    // public void print() {
    //     System.out.println("Isi Stack : ");
    //     for (int i = top; i >= 0; i--){
    //         System.out.println(data[i].jenis + " " + data[i].warna +
    //         " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
    //     }
    //     System.out.println("");
    // }

    // public void clear() {
    //     if (!IsEmpty()) {
    //         for (int i = top; i >= 0; i--){
    //             top--;
    //         }
    //         System.out.println("Data sudah dikosongkan!");
    //     } else {
    //         System.out.println("Stack masih kosong!");
    //     }
    // }

    // public void getMin() {
    //     for (int i = top; i>0; i--) {
    //         if (data[i].harga < data[i-1].harga) {
    //              min = i;
    //         }
    //     }
    //     System.out.println("Data pakaian dengan harga terendah :");
    //     System.out.println(data[min].jenis + " " + data[min].warna +
    //         " " + data[min].merk + " " + data[min].ukuran + " " + data[min].harga);
    // }



    //J8 Queue
    //Class : Queue
    // int [] data;
    // int front;
    // int rear;
    // int size;
    // int max;

    // public Queue(int n){
    //     max = n;
    //     data = new int[max];
    //     size = 0;
    //     front = rear = -1;
    // }

    // public boolean IsEmpty(){
    //     if (size == 0) {
    //         return true;
    //     }else {
    //         return false;
    //     }
    // }

    // public boolean IsFull(){
    //     if (size == max) {
    //         return true;
    //     }else {
    //         return false;
    //     }
    // }

    // public void peek() {
    //     if(!IsEmpty()){
    //         System.out.println("Elemen terdepan: " + data[front]);
    //     }else {
    //         System.out.println("Queue masih kosong");
    //     }
    // }

    // public void print(){
    //     if (IsEmpty()){
    //         System.out.println("Queue masih kosong");
    //     } else {
    //         int i = front;
    //         while (i != rear){
    //             System.out.println(data[i] + " ");
    //             i = (i + 1) % max;
    //         }
    //         System.out.println(data[i] + " ");
    //         System.out.println("Jumlah elemen = " + size);
    //     }
    // }

    // public void clear(){
    //     if (!IsEmpty()){
    //         front = rear = -1;
    //         size = 0;
    //         System.out.println("Queue berhasil dikosongkan");
    //     } else {
    //         System.out.println("Queue masih kosong");
    //     }
    // }

    // public void Enqueue(int dt) {
    //     if (IsFull()) {
    //         System.out.println("Data sudah penuh");
    //         System.exit(0);
    //     }else {
    //         if (IsEmpty()) {
    //             front = rear = 0;
    //         } else {
    //             if (rear == max - 1){
    //                 rear = 0;
    //             } else {
    //                 rear++;
    //             }
    //         }
    //         data[rear] = dt;
    //         size++;
    //     }
    // }

    // public int Dequeue() {
    //     int dt = 0;
    //     if (IsEmpty()) {
    //         System.out.println("Data masih kosong");
    //         System.exit(0);
    //     } else {
    //         dt = data[front];
    //         size--;
    //         if (IsEmpty()) {
    //             front = rear = -1;
    //         } else {
    //             if (front == max -1){
    //                 front = 0;
    //             } else {
    //                 front++;
    //             }
    //         }
    //     }
    //     return dt;
    // }



    //J11 Single Linked List
    //Class : SingleLinkedList
    // Node head;
    // Node tail;

    // public boolean isEmpty() {
    //     return head == null;
    // }

    // public void print() {
    //     if (!isEmpty()) {
    //         Node tmp = head;
    //         System.out.print("Isi Linked List :\t");
    //         while (tmp != null) {
    //             System.out.print(tmp.data + "\t");
    //             tmp = tmp.next;
    //         }
    //         System.out.println("");
    //     } else {
    //         System.out.println("Linked list kosong");
    //     }
    // }

    // public void addFirst(int input) {
    //     Node ndInput = new Node(input, null);
    //     if (isEmpty()) {
    //         head = ndInput;
    //         tail = ndInput;
    //     } else {
    //         ndInput.next = head;
    //         head = ndInput;
    //     }
    // }

    // public void addLast(int input) {
    //     Node ndInput = new Node(input, null);
    //     if (isEmpty()) {
    //         head = ndInput;
    //         tail = ndInput;
    //     } else {
    //         tail.next = ndInput;
    //         tail = ndInput;
    //     }
    // }

    // public void insertAfter(int key, int input) {
    //     Node ndInput = new Node(input, null);
    //     Node temp = head;
    //     do {
    //         if (temp.data == key) {
    //             ndInput.next = temp.next;
    //             temp.next = ndInput;
    //             if (ndInput.next == null)
    //                 tail = ndInput;
    //             break;
    //         }
    //         temp = temp.next;
    //     } while (temp != null);
    // }

    // public void insertBefore (int key, int input) {
    //     Node ndInput = new Node(input, null);
    //     Node temp = head;
    //     Node prev = null;
    //     do {
    //         if (temp.data == key) {
    //             if (prev == null) {
    //                 ndInput.next = head;
    //                 head = ndInput;
    //             } else {
    //                 ndInput.next = temp;
    //                 prev.next = ndInput;
    //             }
    //             break;
    //         } prev = temp;
    //         temp = temp.next;
    //     } while (temp != null);
    // }

    // public void insertAt(int index, int input) {
    //     if (index < 0) {
    //         System.out.println("Index salah");
    //     } else if (index == 0) {
    //         addFirst(input);
    //     } else {
    //         Node temp = head;
    //         for (int i = 0; i < index - 1; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = new Node(input, temp.next);
    //         if (temp.next.next == null)
    //             tail = temp.next;

    //     }
    // }

    // public int getData(int index) {
    //     Node tmp = head;
    //     for (int i = 0; i < index; i++) {
    //         tmp = tmp.next;
    //     }
    //     return tmp.data;
    // }

    // public int indexOf(int key) {
    //     Node tmp = head;
    //     int index = 0;
    //     while (tmp != null && tmp.data != key) {
    //         tmp = tmp.next;
    //         index++;

    //     }
    //     if (tmp == null) {
    //         return -1;
    //     } else {
    //         return index;
    //     }
    // }

    // public void removeFirst() {
    //     if (isEmpty()) {
    //         System.out.println("Linked list masih kosong!");
    //     } else if (head == tail) {
    //         head = tail = null;
    //     } else {
    //         head = head.next;
    //     }
    // }

    // public void removeLast() {
    //     if (isEmpty()) {
    //         System.out.println("Linked list masih kosong!");
    //     } else if (head == tail) {
    //         head = tail = null;
    //     } else {
    //         Node temp = head;
    //         while (temp.next != tail) {
    //             temp = temp.next;
    //         }
    //         temp.next = null;
    //         tail = temp;
    //     }
    // }

    // public void remove(int key) {
    //     if (isEmpty()) {
    //         System.out.println("Linked list masih kosong!");
    //     } else {
    //         Node temp = head;
    //         while (temp != null) {
    //             if ((temp.data == key) && (temp == head)) {
    //                 this.removeFirst();
    //                 break;
    //             } else if (temp.next.data == key) {
    //                 temp.next = temp.next.next;
    //                 if (temp.next == null) {
    //                     tail = temp;
    //                 }
    //                 break;
    //             }
    //             temp = temp.next;
    //         }
    //     }
    // }

    // public void removeAt(int index) {
    //     if (index == 0) {
    //         removeFirst();
    //     } else {
    //         Node temp = head;
    //         for (int i = 0; i < index - 1; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = temp.next.next;
    //         if (temp.next == null) {
    //             tail = temp;
    //         }
    //     }
    // }


    //J12 Double Linked List
    //Class : DoubleLinkedList
    // Node head;
    // int size;
    
    // public DoubleLinkedLists () {
    //     head = null;
    //     size = 0;
    // }

    // public boolean isEmpty () {
    //     return head == null;
    // }

    // public void addFirst(int item) {
    //     if (isEmpty()){
    //         head = new Node(null, item, null);
    //     } else {
    //         Node newNode = new Node(null, item, head);
    //         head.prev = newNode;
    //         head = newNode;
    //     }
    //     size++;
    // }

    // public void addLast(int item) {
    //     if (isEmpty()) {
    //         addFirst(item);
    //     } else {
    //         Node current = head;
    //         while (current.next != null) {
    //             current = current.next;
    //         }
    //         Node newNode = new Node(current, item, null);
    //         current.next = newNode;
    //         size++;
    //     }
    // }

    // public void add (int item, int index) throws Exception {
    //     if (isEmpty()) {
    //         addFirst(item);
    //     } else if(index < 0 || index > size) {
    //         throw new Exception("Nilai index diluar batas");
    //     } else {
    //         Node current = head;
    //         int i = 0;
    //         while (i < index) {
    //             current = current.next;
    //             i++;
    //         }
    //     if (current.prev == null){
    //         Node newNode = new Node(null, item, current);
    //         current.prev = newNode;
    //         head = newNode;
    //     } else {
    //         Node newNode = new Node(current.prev, item, current);
    //         newNode.prev = current.prev;
    //         newNode.next = current;
    //         current.prev.next = newNode;
    //         current.prev = newNode;
    //     }
    //     } size++;
    // }

    // public int size() {
    //     return size;
    // }

    // public void clear() {
    //     head = null;
    //     size = 0;
    // }

    // public void print() {
    //     if (!isEmpty()){
    //         Node tmp = head;
    //         while (tmp != null) {
    //             System.out.print(tmp.data + "\t");
    //             tmp = tmp.next;
    //         }
    //         System.out.println("\nBerhasil diisi");
    //     } else {
    //         System.out.println("Linked Lists Kosong");
    //     }
    // }

    // public void removeFirst() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
    //     } else if (size == 1) {
    //         removeFirst();
    //     } else {
    //         head = head.next;
    //         head.prev = null;
    //         size--;
    //     }
    // }

    // public void removeLast() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
    //     } else if (head.next == null) {
    //         head = null;
    //         size--;
    //         return;
    //     }
    //     Node current = head;
    //     while (current.next.next != null) {
    //         current = current.next;
    //     }
    //     current.next = null;
    //     size--;
    // }

    // public void remove (int index) throws Exception {
    //     if (isEmpty() || index >= size) {
    //         throw new Exception("Nilai indeks di luar batas");
    //     } else if (index == 0) {
    //         removeFirst();
    //     } else {
    //         Node current = head;
    //         int i = 0;
    //         while (i < index) {
    //             current = current.next;
    //             i++;
    //         }
    //         if (current.next == null) {
    //             current.prev.next = null;
    //         } else if (current.prev == null) {
    //             current = current.next;
    //             current.prev = null;
    //             head = current;
    //         } else {
    //             current.prev.next = current.next;
    //             current.next.prev = current.prev;
    //         }
    //         size--;
    //     }
    // }

    // public int getFirst() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List kosong!");
    //     }
    //     return head.data;
    // }

    // public int getLast() throws Exception {
    //     if (isEmpty()) {
    //         throw new Exception("Linked List kosong");
    //     }
    //     Node tmp = head;
    //     while (tmp.next != null) {
    //         tmp = tmp.next;
    //     }
    //     return tmp.data;
    // }

    // public int get(int index) throws Exception {
    //     if (isEmpty() || index >= size) {
    //         throw new Exception("Nilai indeks di luar batas.");
    //     } 
    //     Node tmp = head;
    //     for (int i = 0; i < index; i++) {
    //         tmp = tmp.next;
    //     }
    //     return tmp.data;
    // }


    //J13 Tree & Array Tree

    //Class : Binary Tree
    // Node root;
    // int count;

    // public BinaryTree() {
    //     root = null;
    //     count = 0;
    // }

    // boolean isEmpty() {
    //     return root == null;
    // }

    // void add(int data) {
    //     if (isEmpty()) {
    //         root = new Node(data);
    //     } else {
    //         Node current = root;
    //         while (true) {
    //             if (data < current.data) {
    //                 if (current.left != null) {
    //                     current = current.left;
    //                 } else {
    //                     current.left = new Node(data);
    //                     break;
    //                 }
    //             } else if (data > current.data) {
    //                 if (current.right != null) {
    //                     current = current.right;
    //                 } else {
    //                     current.right = new Node(data);
    //                     break;
    //                 }
    //             } else {
    //                 break;
    //             }
    //         }
    //     }
    // }

    // boolean find(int data){
    //     boolean hasil = false;
    //     Node current = root;
    //     while (current!=null) {
    //         if(current.data == data){
    //             hasil = true;
    //             break;
    //         }else if (data < current.data){
    //             current = current.left;
    //         }else {
    //             current = current.right;
    //         }
    //     }
    //     return hasil;
    // }

    // void traversePreOrder (Node node) {
    //     if (node != null) {
    //         System.out.print(" " + node.data);
    //         traversePreOrder(node.left);
    //         traversePreOrder(node.right);
    //     }
    // }

    // void traversePostOrder (Node node) {
    //     if (node != null) {
    //         traversePostOrder(node.left);
    //         traversePostOrder(node.right);
    //         System.out.print(" " + node.data);
    //     }
    // }

    // void traverseInOrder(Node node) {
    //     if (node != null) {
    //         traverseInOrder(node.left);
    //         System.out.print(" " + node.data);
    //         traverseInOrder(node.right);
    //     }
    // }

    // Node getSuccessor(Node del) {
    //     Node successor = del.right;
    //     Node successorParent = del;
    //     while(successor.left != null){
    //         successorParent = successor;
    //         successor = successor.left;
    //     }
    //     if(successor != del.right){
    //         successorParent.left = successor.right;
    //         successor.right = del.right;
    //     }
    //     return successor;
    // }

    // void delete(int data){
    //     if (isEmpty()) {
    //         System.out.println("Tree is empty");
    //         return;
    //     }

    //     Node parent = root;
    //     Node current = root;
    //     boolean isLeftChild = false;
    //     while (current != null) {
    //         if (current.data == data) {
    //             break;
    //         } else if (data < current.data){
    //             parent = current;
    //             current = current.left;
    //             isLeftChild = true;
    //         } else if (data > current.data) {
    //             parent = current;
    //             current = current.right;
    //             isLeftChild = false;
    //         }
    //     }

    //     if(current == null) {
    //         System.out.println("Couldn't find data!");
    //         return;
    //     } else {
    //         if(current.left == null && current.right == null){
    //             if (current == root) {
    //                 root = null;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = null;
    //                 } else {
    //                     parent.right = null;
    //                 }
    //             }
    //         } else if (current.left == null) {
    //             if (current == root) {
    //                 root = current.right;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = current.right;
    //                 } else {
    //                     parent.right = current.right;
    //                 }
    //             }
    //         }else if (current.right == null) {
    //             if (current == root) {
    //                 root = current.left;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = current.left;
    //                 } else {
    //                     parent.right = current.left;
    //                 }
    //             }
    //         } else {
    //             Node sucessor = getSuccessor(current);
    //             if (current == root) {
    //                 root = sucessor;
    //             } else {
    //                 if (isLeftChild) {
    //                     parent.left = sucessor;
    //                 } else {
    //                     parent.right = sucessor;
    //                 }
    //                 sucessor.left = current.left;
    //             }
    //         }
    //     }
    // }

    //  Node addRekursif(int data, Node current) {
    //     if (current == null) {
    //         return new Node(data);
    //     } else {
    //         if (data < current.data) {
    //             current.left = addRekursif(data, current.left);
    //         } else if (data > current.data) {
    //             current.right = addRekursif(data, current.right);
    //         }
    //         return current;
    //     }
    // }

    // void addR(int data) {
    //     root = addRekursif(data, root);
    // }
    //     int show(int check) {
    //     Node current = root;
    //     if (isEmpty())
    //         System.out.println("Tree Is Empty!");
    //     switch (check) {
    //         case 1:
    //             while (current.right != null)
    //                 current = current.right;
    //             break;
    //         case 2:
    //             while (current.left != null)
    //                 current = current.left;
    //     }
    //     return current.data;
    // }

    //     void getLeaf(Node current) {
    //     if (current != null) {
    //         getLeaf(current.left);
    //         getLeaf(current.right);

    //         if (current.left == null && current.right == null) {
    //             System.out.print(" " + current.data);
    //             count++;
    //         }
    //     }
    // }

    //     int getCountLeaf() {
    //     int tmp = count;
    //     count = 0;
    //     return tmp;
    // }

    //Class : BinaryTreeArray
    // int[] data;
    // int idxLast, anchor = 0;

    // public BinaryTreeArray(){
    //     data = new int[10];
    //     idxLast = -1;
    // }

    // void populateData(int data[], int idxLast){
    //     this.data = data;
    //     this.idxLast = idxLast;
    // }

    // void traverseInOrder(int idxStart){
    //     if (idxStart <= idxLast && data[idxStart] != 0) {
    //         traverseInOrder(2*idxStart+1);
    //         System.out.print(data[idxStart] + " ");
    //         traverseInOrder(2*idxStart+2);
    //     }
    // }

    // void add(int dt){
    //     if (idxLast == data.length - 1) {
    //         System.out.println("Binary tree is full!");
    //         return;
    //     }
    //     idxLast++;
    //     data[idxLast] = dt;
    // }

    // public void traversePreOrder(int idxStart){
    //     if (idxStart <= idxLast && data[idxStart] != 0) {
    //         System.out.print(data[idxStart] + " ");
    //         traversePreOrder(2*idxStart+1);
    //         traversePreOrder(2*idxStart+2);
    //     }
    // }

    // public void traversePostOrder(int idxStart){
    //     if (idxStart <= idxLast && data[idxStart] != 0) {
    //         traversePostOrder(2*idxStart+1);
    //         traversePostOrder(2*idxStart+2);
    //         System.out.print(data[idxStart] + " ");
    //     }
    // }


    
    //J14 Graph
    //Class : Graph (example with LinkedList class)
    
    // int vertex;
    // LinkedList list[];

    // public Graph(int vertex){
    //     this.vertex = vertex;
    //     list = new LinkedList[vertex];
    //     for (int i = 0; i < vertex; i++) {
    //         list[i] = new LinkedList();
    //     }
    // }

    // public void addEdge(int source, int destination, boolean type) {
    //     if (type == true){
    //     //add edge directed graph
    //     list[source].addFirst(destination);
    //     } else {
    //     //add back edge undirected graph
    //     list[destination].addFirst(source);
    //     }
    // }

    // public void degree(int source, boolean type) throws Exception {
        
    //     if (type == true){
    //     //degree directed graph
    //         //inDegree
    //     int k, totalIn = 0, totalOut = 0;
    //     for (int i = 0; i < vertex; i++) {
    //         for (int j = 0; j < list[i].size(); j++) {
    //             if (list[i].get(j) == source)
    //                 ++totalIn;
    //         }
    //         //OutDegree
    //         for (k = 0; k < list[source].size(); k++) {
    //             list[source].get(k);
    //         }
    //     totalOut = k;
    //     }
    //     System.out.println("Indegree dari vertex " + source + " : " + totalIn);
    //     System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
    //     System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
    // } else {
    //     //degree undirected graph
    //     System.out.println("degree vertex " + source + " : " + list[source].size());
    // }
    // }

    // public void removeEdge(int source, int destination) throws Exception{
    //     LinkedList sourceLL = list[source];
    //     LinkedList destinationLL = list[destination];
    //     for (int i = 0; i < sourceLL.size(); i++) {
    //         if(sourceLL.get(i)==destination) {
    //             sourceLL.remove(i);
    //         }
    //     }
    //     for (int i = 0; i < destinationLL.size(); i++) {
    //         if(destinationLL.get(i)==source) {
    //             destinationLL.remove(i);
    //         }
    //     }
    // }

    // public void removeAllEdges() {
    //     for (int i = 0; i < vertex; i++) {
    //         list[i].clear();
    //     }
    //     System.out.println("Graph berhasil dikosongkan");
    // }

    // public void printGraph() throws Exception{
    //     for (int i = 0; i < vertex; i++) {
    //         if (list[i].size() > 0) {
    //             System.out.print("Vertex " + i + " terhubung dengan : ");
    //             for (int j = 0; j < list[i].size(); j++) {
    //                 System.out.print(list[i].get(j) + " ");
    //             }
    //             System.out.println("");
    //         }
    //     }
    //     System.out.println(" ");
    // }

    //     public boolean graphType(String type) {
    //     return type.equalsIgnoreCase("Directed");
    // }
}