/**
 * Class StackEmptyException throws a StackEmptyException
 *
 * @author David Socaciu
 * @version 2025-01-18
 */
public class StackFullException extends Exception {
    /**
     * Exception thrown when attempting to pop or peek an empty stack.
     */
    public StackFullException(String message) {
        super(message);
    }
}
