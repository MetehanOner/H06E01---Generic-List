package de.tum.in.ase;

// TODO: make it implement the interface MyList
public class LinkedList<T> implements MyList<T> {
    // TODO: add attributes
    private ListNode<T> first;
    private ListNode<T> last;

    // TODO: add a constructor
    public LinkedList() {

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
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(Object o) {

    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

}
