package list.linkedList;

/**
 * @author Eric Reinprecht
 * <p>
 * created on 10.11.2022
 */

import list.HTLList;

public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node(4);
        if (root==null){
            root=n;
        } else {
            Node actual = root;
            while (actual.getNext()!=null){
                actual = actual.getNext();
            }
            actual.setNext(n);
        }

    }

    @Override
    public int get(int index) {
        Node actual = root;
        int counter = 0;

        while(counter<index){
            actual = actual.getNext();
            counter++;
        }




        return actual.getValue();

    }

    @Override
    public void remove(int index) {

    }
}
