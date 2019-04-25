import java.lang.annotation.ElementType;
import java.util.Iterator;
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

    public ListNode<E> getStart() {
        return start;
    }

    public ListNode<E> getEnd() {
        return end;
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
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean deleteLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<E>(this);
    }
}
