/** Steve Hjortness
 * MyLinkedListClient.java
 * Description - This is a program that creates a linked list data structure.  This implementation
 * holds a string element of airport abbreviations.  The program will present the user with options
 * to add the first link, remove the first link, add to the last link, traverse the list, and finally
 * search for an element in the list. */

import java.util.*;


public class MyLinkedListClient {
   static Scanner console = new Scanner(System.in);

	public static void main(String [] args) {
	
		//create a linked list object of String
      
      MyLinkedList<String> airportList = new MyLinkedList<String>();
                  
      boolean flag = true;          //boolean to control while loop
      boolean check;                //boolean to indicate if element is or is not in the list
	   int userCommand;
      String airport;               //string for input values
     		
      while(flag) {              //prompt the user to make a selection until they wish to exit
		
		    displayMenu();         //call a user method that defines the options
			           
			 userCommand = console.nextInt();
          //based on the user selection, execute a particular case
			 switch(userCommand) {
          
    	       case 1:            //addFirst - add to beginning of the list
                System.out.println("Please enter an element to be added to the beginning of the list: ");
                airport = console.next();
                airportList.addFirst(airport);
                System.out.println("This list now looks like: ");
                System.out.println(airportList.traverse()); 
                break;
					  
             case 2:           //removeFirst - remove the head    
                  try{
                     System.out.println(airportList.removeFirst() + " is removed from the list.");
                     System.out.println("This list now looks like: ");
                     System.out.println(airportList.traverse()); 
                  }
                  catch(EmptyListException e){
                     System.out.println(e);
                  }
                  break;
				 
		       case 3:           //addLast - remove the last node in the list
                  System.out.println("Please enter an element to be added to the end of the list: ");
                  airport = console.next();
                  airportList.addLast(airport);
                  System.out.println("This list now looks like: ");
                  System.out.println(airportList.traverse()); 
		            break;
                  
		         case 4:           //traverse the list and output the contents
                  System.out.println(airportList.traverse()); 
                  break;
                  
               case 5:           //search the list 
                  System.out.println("Please enter an element you wish to search for in the list: ");
                  airport = console.next();
                  check = airportList.search(airport);
                  System.out.println(check+" that "+airport+" is in the list." );
           		   break;
                  
		         case 0:             //exit
		           flag = false;
		           break;
                 
		         default:
		         	System.out.println("Invalid command, try again.");
					  
          }//end of switch
      }//end of while
	}//end of main
   
   private static void displayMenu() {        //user method that defines the options
	      System.out.print("\n\n"
               +"Please make a selection:\n\n"
		         +"1 --- Add a node to the beginning of the list\n"
		         +"2 --- Remove the first node in the list\n"
		         +"3 --- Add a node on the end of the list\n"
               +"4 --- Traverse the list and output its contents\n"
		         +"5 --- Search the list for an element\n"
		   		+"0 --- Exit\n\n"
		         +"Enter a command: " ); 
	 } 
}//end of class







