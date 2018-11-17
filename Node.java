/** Steve Hjortness
 * Node.java
 * Description - This is a class that creates a node that represents a link in a linked list
 * structure.  The node is capable of supporting a generic element within the node which is defined
 * at run time.  The class includes methods for constructors, and getters and setters. */

public class Node<E> {

   //instance  variable
   private E element;      //generic objecct
   private Node<E> next;         //it points to another node
   
   //default constructor
   public Node(){
      this(null,null);
   }

   public Node(E element, Node<E> next){
      this.element = element;
      this.next = next;
   }
   
   //setters and getters
   public E getElement(){
      return element;
   }
   
   public void setElement(E element){
      this.element= element;
   }

   public Node<E> getNext(){
      return next;
   }

   public void setNext(Node<E> next) {
      this.next = next;
   }


}