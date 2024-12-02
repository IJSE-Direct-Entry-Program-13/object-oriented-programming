package main;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        stack.pop();
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        stack.print();

        System.out.println("==============");

        for(int value: stack) System.out.println(value);
    }
}

class MyStack implements Iterable<Integer>{
    private final ArrayList<Integer> values = new ArrayList<>();

    public void push(int value){
        values.add(value);
    }

    public boolean pop(){
        if (values.isEmpty()) return false;
        values.remove(values.size()-1);
        return true;
    }

    public int size(){
        return values.size();
    }

    public void print(){
        System.out.println("===");
        for (int i = values.size() - 1; i >= 0 ; i--) {
            System.out.printf("|%d|%n", values.get(i));
        }
        System.out.println("===");
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyStackIterator(values);
    }
}
class MyStackIterator implements Iterator<Integer>{
    private final ArrayList<Integer> values;
    private int i = 0;
    public MyStackIterator(ArrayList<Integer> values) {
        this.values = values;
    }
    @Override
    public boolean hasNext() {
        return i < values.size();
    }
    @Override
    public Integer next() {
        return values.get(values.size() - i++ - 1);
    }
}
