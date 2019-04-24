public interface MyList<E> {
    void insertFirst(E element);
    void insertLast(E element);
    boolean search(E element);
    int size();
    E getValueByIndex(int index);
    boolean deleteFirst();
    boolean deleteLast();
}
