import java.lang.annotation.ElementType;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements MyList<E> {
    private ListNode<E> start;
    private ListNode<E> end;
    private int size = 0;


    public MyLinkedList(){
        end = new ListNode<>(null,null, start);
        start = new ListNode<>(null, end,null);
    }


    @Override
    public void insertFirst(E element) {
        ListNode<E> next = start;
        next.setValue(element);
        start = new ListNode<>(null,next,null);
        next.setPrevious(start);
        size++;
    }

    @Override
    public void insertLast(E element) {
        ListNode<E> prev = end;
        prev.setValue(element);
        end = new ListNode<>(null,null,prev);
        prev.setNext(end);
        size++;
    }

    @Override
    public boolean search(E element) {
        ListNode<E> current = start.getNext();
        for(int i = 0; i < size; i++){
            if(current.getValue().equals(element)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getValueByIndex(int index) {
        if (index < size){
            ListNode<E> current = start.getNext();
            for(int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getValue();

        }else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean deleteFirst() {
        ListNode<E> tempNode = start;
        start = tempNode.getNext();
        start.setPrevious(null);
        size--;
        return true;
    }

    @Override
    public boolean deleteLast() {
        ListNode<E> tempNode = end;
        end = tempNode.getPrevious();
        end.setNext(null);
        size--;
        return true;
    }

    private class ListNode<E> {
        E value;
        ListNode<E> next;
        ListNode<E> previous;

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
}
