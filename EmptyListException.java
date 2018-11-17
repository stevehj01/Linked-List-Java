/** Steve Hjortness
 * EmptyListException.java
 * Description - This is a method that provides exception handling when trying to remove a
 * link from an empty linked list
 */

public class EmptyListException extends RuntimeException{
	public EmptyListException(String m) {
		super(m);
      
	}
}
