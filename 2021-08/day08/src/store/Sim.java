package store;

public class Sim {
	public static void main(String[] args) {
		// Creating a store to move within
		Store store = new Store();
		
		// call the init method first to create the store
		store.init();
		
		// shopper will exist here
		Customer shopper = new Customer();
		
		// Establish the starting location for the player
		shopper.setCurrentLocation(store.getFirstAisle());
		
 // gather input here
		
	}
	
	public void changeShopperLocation(Customer shopper) {
//	if sttmt here to determine which direction to go
		
		
// runs if choice is fwd
		Aisle targetLocation = shopper.getCurrentLocation().moveForward();

		// moves shopper there, updates reference
		shopper.setCurrentLocation(targetLocation);	
	}
}
