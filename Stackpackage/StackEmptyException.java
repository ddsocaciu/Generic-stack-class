package Stackpackage;

/**
 * Class Stackpackage.StackEmptyException throws a Stackpackage.StackEmptyException
 *
 * @author David Socaciu
 * @version 2025-01-18
 */
public class StackEmptyException extends Exception {
    /**
     * Exception thrown when attempting to push on a full stack
     */
    public StackEmptyException(String message) {
        super(message);
    }
}
