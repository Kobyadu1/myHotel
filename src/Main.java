
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Client Class Test
		Client client1 = new Client("William", 23);

		// William is our new client, lets greet him to see what he says
		print(client1.Greeting());

		// It appears that William prefers to go by 'Bill', lets help him by changing his name
		client1.setFirstName("Bill");
		print(client1.getFirstName());

		// Bill wants to buy some spray paint for his art project, lets make sure his is old enough to make this purchase
		print(client1.getAge());

		// Lets check-in with our new Client
		Client client2 = new Client("Jessica", 29);

		// Jessica's 30th birthday is today and her age needs to be updated, Let make the change
		client2.setAge(30);
		print(client2.getAge());


		/* Hotel hotel1 = new Hotel("Hotel Transylvannia", 20);
		hotel1.addRooms("Basic Suite", 4, 5);
		hotel1.addRooms("Deluxe Suite", 4, 2);
		hotel.addRoom("Honeymoon Suite", 2);
		*/
		

	}

	// Simple print
	public static void print(Object message){
		System.out.println(message.toString());

	}

}
