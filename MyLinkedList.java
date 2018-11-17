/** Steve Hjortness
 * MyLinkedList.java
 * Description - This is a class that creates a linked list structure.  The list is capable of supporting a generic
 * element within the list which is defined at run time.  The class includes methods for constructors,
 * size, checking if the list is empty, adding to the beginning and end of the list, removing the first
 link in the list, traversing or outputing the contents of the list, and searching for an element in
 the list */

public class MyLinkedList<E> {
	
	//declare variables
   private int size;       //number of nodes in the list
   private Node<E> head;   //head pointer to beginning of the list
   private Node<E> tail;   //tail pointer to the last link in the list
   
	//constructor
   
   public MyLinkedList(){
      head = null;
      size = 0;
      tail = null;   }
	
   //method to determine if the list is empty
   public boolean isEmpty() {
      if (head == null)          //if (size == 0)
	      return true;
      return false;
   }
   
   //method to return the number of links in the list
   public int size (){
      return size;
   }
	
   //method to add a link to the beginning of the list
   public void addFirst(E element){
            Node<E> temp = new Node<E>(element, null);  //create a new Node for the element
      
      if( isEmpty ()){              //if list is empty
         head = temp;               //make the head and tail ptrs point to new node
         tail = head;
      }
      else{
         temp.setNext(head);        //set temp's next ptr = head
         head = temp;               //make the temp ptr now the head
         
      }
      size ++;
   }
      
   //method to remove the first link in the list         
   public E removeFirst() throws EmptyListException {
      if (isEmpty())
         throw new EmptyListException("The list is empty.");
         
      Node<E> temp = head;             //create a temp ptr to hold the head ptr
      head = head.getNext();           //move head ptr to the next node
      
      E element = temp.getElement();      //retrieve the element of the first node being removed
      
      temp.setNext(null);              //detach it from the linked list
      temp = null;                     //now temp is garbage
      size--;
      
      return element;
  }
   
   //method to add a link to the last link in the list
   public void addLast(E element) {    
        //create a new Node for the element
      Node<E> temp = new Node<E>(element, null);    //create a new link called temp
      
      if( isEmpty ()){              //if empty, the tail ptr is the same as the head ptr
         head = temp;
         tail = head;
      }
      else{
         tail.setNext(temp);        //pt the last link's next to temp
         tail = temp;               //make the tail ptr now temp's next
      }
      size ++;
   }
   
   //method to step through the list and output the elements in the links   
   public String traverse(){     //this is a toString() method
      
      if(size == 0)
         return "Empty list";
         
      Node<E> temp = head;       //use temp ptr to traverse the list
      
      String result = "Head -->";
      
      int i = 0;
      
      while(i<size) {
         result += temp.getElement() + "-->";
         temp = temp.getNext();                 //go to the next node
         i++;
      }
      
      return result;
   }
	
   //method to step through the list and see if there is a match
   public boolean search(E element){
      Node<E> temp = head;                      //create a temp ptr, set to head
      int i = 0;
      while(i<size){
         if(temp.getElement() .equals (element)){
            return true;
         }
         else{
            i++;
            temp = temp.getNext();
         }
      }
      return false;
   }      
 
}//end of class







