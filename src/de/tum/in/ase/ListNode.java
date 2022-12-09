package de.tum.in.ase;

public class ListNode<T> {
    // TODO: add attributes
    private T value;
    private ListNode<T> previous;
    private ListNode<T> next;

    // TODO: add 3 constructors as in the problem statement
    public ListNode() {
        value = null;
        next=null;
        previous=null;
    }

    public ListNode(T value) {
        this.value = value;
        next=null;
        previous=null;
    }

    public ListNode(T value, ListNode<T> previous, ListNode<T> next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    // TODO: add getters and setters

    public ListNode<T> getNext() {
        return next;
    }

    public ListNode<T> getPrevious() {
        return previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void setPrevious(ListNode<T> previous) {
        this.previous = previous;
    }
}
