package kuka;

import java.util.*;
public class MyQueue<T> {
    private final ArrayList<T> list;

    MyQueue() {
        list = new ArrayList<T> ();
    }

    public int size() {
        return list.size ();
    }

    public boolean isEmpty() {
        return list.size () == 0;
    }

    public T enqueue(T n) {
        list.add ( n );
        return n;
    }

    public T dequeue() {
        return list.remove ( 0 );
    }

    public T peek() {
        return list.get ( 0 );
    }

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<> ();
        int i = 0;
        while (!(i >= 5)) {
            System.out.println ( queue.enqueue ( i++ ) + ", was added" );
        }

        if(queue.isEmpty ()) {
            System.out.println ("Your queue is empty");
        }else {
            System.out.println ( queue.dequeue () + ", was deleted" );
        }
        System.out.println (queue.peek () + ", queue's first element");
        System.out.println (queue.size () + ", queue's size");

    }

}