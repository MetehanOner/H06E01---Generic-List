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
        if(isEmpty()){
            return "[" + "]";
        }
        ListNode<T> list = first;
        String result = "[" + list.getValue();
        ListNode<T> listStart = list.getNext();
        for(list = listStart; list != null; list = list.getNext()) {
            result = result + ", " + list.getValue();
        }
        return result + "]";
    }


    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        }

        ListNode<T> cur = first;

        int counter = 0;
        while(cur != null) {
            cur = cur.getNext();
            counter++;
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean contains(T o) {

        if(isEmpty()) {
            return false;
        }

        ListNode<T> list = first;

        if(list.getValue().equals(o)){
            return true;
        }

        ListNode<T> listStart = list.getNext();
        for(list = listStart; list != null; list = list.getNext()) {
            if(list.getValue().equals(o)){
                return true;
            }
        }

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

        if(o == null) {
            return;
        }

        if(!contains(o)){
           return;
        }

        ListNode<T> list = first;

        if(list.getValue().equals(o)){
            //remove element
            first = first.getNext();
            first.setPrevious(null);
        }

        ListNode<T> listStart = list.getNext();
        for(list = listStart; list != null; list = list.getNext()) {
            if(list.getValue().equals(o)){
                //remove element
                list.getPrevious().setNext(list.getNext());
                list.getNext().setPrevious(list.getPrevious());
            }
        }

    }

    @Override
    public void clear() {

        if(isEmpty()) {
            return;
        }

        first = last = null;

    }

    @Override
    public T get(int index) {

        if(index < 0 || index >= size()) {
            String message = "List index is out of bound";
            throw new IndexOutOfBoundsException(message);
        }

        ListNode<T> cur = first;

        int counter = 0;
        if(cur != null) {
            while(counter != index){
                cur = cur.getNext();
                counter++;

            }
            return cur.getValue();

        }

        return null;
    }

    @Override
    public void add(int index, T element) {

        if(index < 0 || index >= size()) {
            String message = "List index is out of bound";
            throw new IndexOutOfBoundsException(message);
        }

        ListNode<T> newNode = new ListNode<>(element);

        ListNode<T> cur = first;
        int counter = 0;
        while(counter != index) {
            cur = cur.getNext();
            counter++;
        }

        ListNode<T> curPre = cur.getPrevious();
        ListNode<T> curNext = cur.getNext();

        if(curPre != null) {
            cur.setPrevious(newNode);

            newNode.setNext(cur);
            newNode.setPrevious(curPre);

            curPre.setNext(newNode);

        } else if (curPre == null) {
            cur.setPrevious(newNode);
            newNode.setNext(cur);
            first = newNode;

        } else if (curNext == null) {
            cur.setNext(newNode);
            newNode.setPrevious(cur);
            last = newNode;
        }

    }

    @Override
    public T remove(int index) {

        if (index < 1 || index > size()) {
            String message = "List index is out of bound";
            throw new IndexOutOfBoundsException(message);
        }

        ListNode<T> cur = first;

        T deletedNode = null;
        if (first != null) {

            for (int i = 0; i < index - 1 && cur.getNext() != null; i++) {
                cur = cur.getNext();
            }
            cur.setNext(cur.getNext().getNext());
            deletedNode = cur.getNext().getValue();

        }

        return deletedNode;
    }

    @Override
    public int indexOf(T o) {

        ListNode<T> cur = first;

        if(cur!=null){
            int i=0;
            while(cur.getNext()!=null){
                if(cur.getValue().equals(o)){
                    return i;
                }
                cur = cur.getNext();
                i++;
            }
        }

        return -1;
    }
}
