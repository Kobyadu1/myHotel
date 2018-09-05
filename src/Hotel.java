import java.util.List;

public class Hotel {
	
	/* Hotel Class has three properties, a Name, a Capacity and list of Rooms
	   Declare the properties below as private variables 
	*/
	
	// name
	// capacity
	// roomList
	
	
	/* The constructor method takes two arguments: Name and Capacity
	 * A Hotel always initializes with an list of rooms
	 * Write a constructor that initializes these two variables
	 */

	public Hotel(String name, int capacity ) {
		// TODO Auto-generated constructor stub
	}
	
	// Write method to room to hotel takes in type and capacity as arguments; note 'Error' should be printed if adding a room will go over the capacity of the hotel
	public void addRoom(String type, int capacity){
		
	}
	
	// Similar to add room but takes in another argument that is the number of such rooms to add 
	public void addRooms(String type, int capacity, int numRooms){
		
	}
	
	// Write getter method for room that takes in a room number as an argument
	public Room getRoom(){
		return new Room();
	} 
	
	// Write a method for room status that takes in a room number as an argument; Status 
	public Room getRoomStatus(){
		return new Room();
	} 
	
	// Write a method that adds a client to a room given a room number and a client
	public void checkinGuest(int roomNumber, Client guest){
		
	}
	
	// Similar to check-in guest but takes a list of Clients
	public void checkinGuests(int roomNumber, List<Client> guests){
		
	}
	
	// Write a method that removes a client from a room given a room number and a client firstname
	public void checkoutGuest(int roomNumber, String name){
		
	}
	
	// Similar to check-out guest but checkouts all guests from a given room
	public void checkoutGuests(int roomNumber){
		
	}
	
	// Write a method that return total number of guests in the hotel
	public int getTotalGuests(){
		return 0;
	}
	

}
