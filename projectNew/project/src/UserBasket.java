import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserBasket {

    private final List<MenuItem>userBasket = new ArrayList<>();
    MenuList menuList = new MenuList();
    private MenuItem menuItem;
	private PostgreSQL postgreSQL;
    
    private List<MenuItem>items;
    
    public UserBasket() {
    	items =new ArrayList<MenuItem>();
    }
    
    
    public void displayBasket(){
    	
        if(userBasket.isEmpty()){
            System.out.println("Twój koszyk jest pusty, złóż zamówinie! :)\n");
        }else{
            System.out.println("W twoim koszyku znajduję się :\n");
			double totalPrice=0.0;
            for(MenuItem basket :userBasket){
                System.out.println(basket.getName()+" koszt to "+basket.getPrice() );
				totalPrice+=basket.getPrice();
                System.out.println();
				postgreSQL.saveToDatabase(totalPrice,userBasket);
                
            }
			System.out.println("Całkowita cena koszyka: " + totalPrice);
            System.out.println("Czy chcesz zamówić zawartość koszyka?");
            System.out.println("1 - aby potwierdzić /0 - kontyunuj zakupy");
            	 Scanner scanner = new Scanner(System.in);
                 int choice = scanner.nextInt();
                if(choice==1) {
                	 System.out.println("Zamówienie zostało złożone:");
                	 System.out.println("Realizacja zamówienia..."); 
                	  userBasket.clear();
                     
                }else {
                	System.out.println("rozumiem :)");
                }      
        }

    }
    public void addItem() {
 		System.out.println("Co chcesz zamówić?");
 	
 		List<MenuItem>dostepneProdukty =List.of(
 	            new MenuItem(0, "Hamburger", "Pyszny burger ", 4.95),
 	            new MenuItem(1, "Cheeseburger", "Pyszny burger z serem", 6.50),
 	            new MenuItem(2, "Chicken burger", "Grillowany filet w bułce", 5.00),
 	            new MenuItem(3, "Vegan Burger", "Burger dla vegan 0% mięsa", 7.50),
 	            new MenuItem(4, "Pepsi", "Odświeżający napój", 3.50),
 	            new MenuItem(5, "Woda", "Woda w butelce", 1.50),
 	            new MenuItem(6, "Frytki", "Przepyszne świeżo smażone frytki!", 3.50),
 	            new MenuItem(7, "Nuggetsy", "Kawałki kurczaka", 5.60));
 		for(MenuItem item :dostepneProdukty) {
 			  System.out.println(item.getId()+". "+item.getName()+" "+item.getPrice()+" $");
 		}
 		System.out.println("Wybierz numer");
 		Scanner scan = new Scanner(System.in);
 		int choice = scan.nextInt();
 		
 		if(choice >= 0 && choice < dostepneProdukty.size()) {
 		MenuItem selectedItem = dostepneProdukty.get(choice);
 		userBasket.add(selectedItem);
 		System.out.println(selectedItem.getName()+ " zostal dodany do koszyka. Do zapłaty "+selectedItem.getPrice());
 		System.out.println();
     }else {
     	System.out.println("Nieprawidłowy numer przedmiotu");
     }
 		
 }


}
