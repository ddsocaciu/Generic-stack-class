package Stackpackage;

/**
 * Test class for the Stack class.
 * Demonstrates the functionality with a number stack and a text stack.
 */
public class StackTest {
    public static void main(String[] args) {
        try {
            // Test with a stack of integers
            Stack<Integer> numberStack = new Stack<>(5);
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);
            System.out.println("Number Stack: " + numberStack.list());
            System.out.println("Peek: " + numberStack.peek());
            System.out.println("Pop: " + numberStack.pop());
            System.out.println("Number Stack after pop: " + numberStack.list());

            // Test with a stack of strings
            Stack<String> textStack = new Stack<>(3);
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Text Stack: " + textStack.list());
            System.out.println("Peek: " + textStack.peek());
            textStack.push("Java");
            System.out.println("Text Stack after push: " + textStack.list());
            System.out.println("Pop: " + textStack.pop());
            System.out.println("Text Stack after pop: " + textStack.list());

            // Edge cases
            System.out.println("Attempting to pop from empty stack:");
            Stack<Integer> emptyStack = new Stack<>(1);
            emptyStack.pop(); // This should throw StackEmptyException
        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
