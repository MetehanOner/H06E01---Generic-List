package de.tum.in.ase;

// TODO: make it implement the interface MyList
public class LinkedList<T> implements MyList<T> {
    // TODO: add attributes
    private ListNode<T> first;
    private ListNode<T> last;

    // TODO: add a constructor
    public LinkedList() {
        first = null;
        last = null;
    }
    // TODO: add getters and setters

    public ListNode<T> getFirst() {
        return first;
    }

    public ListNode<T> getLast() {
        return last;
    }

    public void setFirst(ListNode<T> first) {
        this.first = first;
    }

    public void setLast(ListNode<T> last) {
        this.last = last;
    }


    // TODO: implement interface methods

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public void add(T t) {

        ListNode<T> newNode = new ListNode<>(t);

        if(isEmpty()) {
           first = last =  newNode;
           return;
        }

        newNode.setPrevious(last);
        last.setNext(newNode);
        last = newNode;

    }

    @Override
    public void remove(T o) {

    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(T o) {
        return 0;
    }
}
