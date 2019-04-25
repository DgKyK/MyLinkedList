public class ListNode<E> {
    private E value;
    private ListNode<E> next;
    private ListNode<E> previous;

    public ListNode(E vallue , ListNode<E> next, ListNode<E> previous){
        this.value = vallue;
        this.next = next;
        this.previous = previous;
    }

    public E getValue() {
        return value;
    }

    public ListNode<E> getNext() {
        return next;
    }

    public ListNode<E> getPrevious() {
        return previous;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    public void setPrevious(ListNode<E> previous) {
        this.previous = previous;
    }
}
