import java.util.List;

public class Room {	
	
	/* Room Class has three properties, a room number a capacity and list of guests
	   Declare the properties below as private variables 
	*/
	
	// roomNumber
	// capacity
	// guestList
	
	
	/* The constructor method takes two arguments: roomNumber and Capacity
	 * A room always initializes with an empty guest list
	 * Write a constructor that initializes these two variables
	 */
	
	// Note: you may add more methods to this class if you believe that it will help with the assignment 
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	// Write method to add guest to guest list, takes a Client as an argument; Note: Monster Clients cannot be in the same room as human clients
	// Rooms cannot have more guests than the capacity
	public void addGuest(Client guest){
		
	}
	
	// Similar to add guest but takes in a list of Clients as an argument
	public void addGuests(List<Client> guests ){
		
	}
	
	// Write method to return each guests greeting on a new line; hint use '\n'  
	public String greetGuests(){
		return "";
	}
	
	// Write method to checkout all guests 
	public void checkoutGuests(){
		
	}
	
	

}
