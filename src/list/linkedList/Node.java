package list.linkedList;

/**
 * @author Eric Reinprecht
 * <p>
 * created on 10.11.2022
 */

public class Node {
    private int value;
    private list.linkedList.Node next;

    public Node(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public list.linkedList.Node setValue(int value) {
        this.value = value;
        return this;
    }

    public list.linkedList.Node getNext() {
        return next;
    }

    public list.linkedList.Node setNext(list.linkedList.Node next) {
        this.next = next;
        return this;
    }
}
