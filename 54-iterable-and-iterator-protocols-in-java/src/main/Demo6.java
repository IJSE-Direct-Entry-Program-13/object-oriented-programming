package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class Demo6 {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.print();

        System.out.println("===========");
        System.out.print("[");
        for(int value: queue){
            System.out.print(value + ", ");
        }
        System.out.println("\b]");

        MyQueue queue2 = new MyQueue();
        queue2.enqueue(100);
        queue2.enqueue(200);
        queue2.enqueue(300);
        queue2.enqueue(400);
        queue2.print();
    }
}

class MyQueue implements Iterable<Integer>{
    private ArrayList<Integer> values = new ArrayList<>();

    void enqueue(int value) {
        values.add(0,value);
    }

    boolean dequeue() {
        if (values.isEmpty()) return false;
        values.remove(values.size() - 1);
        return false;
    }

    int size() {
        return values.size();
    }

    void print() {
        System.out.print("[");
        for (Integer value : values) {
            System.out.print(value + ",");
        }
        System.out.println("\b]");
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyQueueIterator(values);
    }
}

class MyQueueIterator implements Iterator<Integer>{
    private final ArrayList<Integer> values;
    private int i;

    public MyQueueIterator(ArrayList<Integer> values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return i < values.size();
    }

    @Override
    public Integer next() {
        return this.values.get(i++);
    }
}
