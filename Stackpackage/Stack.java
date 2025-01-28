package Stackpackage;

/**
 * Class Stackpackage.Stack which is a Generic class with methods such as push, pop, peek & list
 *
 * @author David Socaciu
 * @version 2025-01-18
 * @param <T>
 */
public class Stack<T> {

    private T[] array;
    private int size;
    private int cap;

    /**
     * A default constructor with default values for the aattributes
     */
    public Stack(){
        this.cap = 5;
        this.array = (T[]) new Object[this.cap];
        this.size = 0;
    }

    /**
     * A Constructor which initializes the stack with a (übergebene) capacity
     * @param cap
     */
    public Stack(int cap){
        if(this.cap <= 0){
            this.cap = 5;
            System.err.println("Capacity was negative or zero. New Capacity is 5");
        }else{
            this.cap = cap;
        }
        this.array = (T[]) new Object[cap];
        this.size = 0;
    }

    /**
     * Pushes an item on the stack
     * @param item the parameter to push on the stack
     * @throws StackFullException if the stack is full
     */
    public void push(T item) throws StackFullException{
        if(this.size >= this.cap){
            throw new StackFullException("The stack is fulled up");
        }
        array[this.size] = item;
    }

    /**
     * Pops an element of the stack
     * @return the top element
     * @throws StackEmptyException
     */
    public T pop() throws StackEmptyException{
        if(this.size == 0){
            throw new StackEmptyException("The stack is empty");
        }
        T array = this.array[--this.size];
        this.array[this.size] = null;
        return array;
    }

    /**
     * Peeks at the top element without removing it.
     *
     * @return the top element of the stack
     * @throws StackEmptyException if the stack is empty
     */
    public T peek() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException("Stackpackage.Stack is empty.");
        }
        return array[size - 1];
    }
    /**
     * Returns a string representation of the stack's elements, separated by `;`.
     *
     * @return a string of elements in the stack
     */
    public String list() {
        if (size == 0) {
            return "";
        }
        String result = "";
        for (int i = 0; i < size - 1; i++) {
            result += array[i] + ";";
        }
        result += array[size - 1];
        return result;
    }
}
