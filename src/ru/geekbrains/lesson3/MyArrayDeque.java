package ru.geekbrains.lesson3;

public class MyArrayDeque<Item> {
    private MyArrayStack<Item> stack;

    public MyArrayDeque() {
        stack = new MyArrayStack<>();
    }

    public void insertLeft(Item item){
        stack.push(item);
    }

    public void insertRight(Item item){
        reverse();
        stack.push(item);
        reverse();
    }

    public Item removeLeft(){
       return stack.pop();
    }

    public Item removeRight(){
        reverse();
        Item item = stack.pop();
        reverse();
        return item;
    }

    public Item peekLeft(){
        return stack.peek();
    }

    public Item peekRight(){
        reverse();
        Item item = stack.peek();
        reverse();
        return item;
    }

    private void reverse(){
        MyArrayStack<Item> temp = new MyArrayStack<>();
        while (stack.size() != 0) {
            temp.push(stack.pop());
        }
        stack = temp;
    }

    @Override
    public String toString() {
        return stack.toString(",");
    }
}
