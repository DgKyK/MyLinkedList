import java.util.Iterator;

public class MyIterator<E> implements Iterator {
    private int counter = 0;
    private MyLinkedList<E> list;

    public MyIterator(MyLinkedList<E> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        ListNode<E> current = list.getStart().getNext();
        for (int i = 0 ; i < counter; i++){
            current = current.getNext();
        }
        if (current.getNext() != null) {
            return true;
        }else{
            return false;
        }

    }

    @Override
    public Object next() {
        return list.getValueByIndex(counter++);
    }
}
