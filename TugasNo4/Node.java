package TugasNo4;

public class Node<T> {
    T data, dt;
    Node<T> prev, next;

    Node(Node<T> prev, T data, T dt, Node<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.dt = dt;
    }
}
