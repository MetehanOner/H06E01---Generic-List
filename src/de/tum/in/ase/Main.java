package de.tum.in.ase;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(265);
        l.add(1,2);
        l.add(2,300);
        l.add(500);
        l.add(4,6);
        System.out.println(l.toString());
        System.out.println(l.size());
        //l.clear();
        //System.out.println(l.toString());
        //System.out.println(l.size());
        System.out.println(l.contains(265));
        System.out.println(l.contains(22));
        System.out.println(l.contains(500));
    }
}
