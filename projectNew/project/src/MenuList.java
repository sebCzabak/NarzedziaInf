import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuList {

    private final List<MenuItem>menuItems= List.of(
            new MenuItem(0, "Hamburger", "Pyszny burger ", 4.95),
            new MenuItem(1, "Cheeseburger", "Pyszny burger z serem", 6.50),
            new MenuItem(2, "Chicken burger", "Grillowany filet w bułce", 5.00),
            new MenuItem(3, "Vegan Burger", "Burger dla vegan 0% mięsa", 7.50),
            new MenuItem(4, "Pepsi", "Odświeżający napój", 3.50),
            new MenuItem(5, "Woda", "Woda w butelce", 1.50),
            new MenuItem(6, "Frytki", "Przepyszne świeżo smażone frytki!", 3.50),
            new MenuItem(7, "Nuggetsy", "Kawałki kurczaka", 5.60));

    public void displayMenu(){
        System.out.println("Menu: ");
        for(MenuItem item:menuItems){
            System.out.println(item.getId()+". "+item.getName()+" "+item.getPrice()+" $");
        }
        System.out.println();
    }
    public void displayDescription(int id){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Do którego z produktów chcesz zobaczyć opis?");
        displayMenu();
        int choice=scanner.nextInt();
        System.out.println("Opis: ");
       Map<Integer,String> itemMap=new HashMap<>();
       itemMap.put(1,"Pyszny burger ");
       itemMap.put(2,"Pyszny burger z serem");
       itemMap.put(3,"Grillowany filer w bułce");
       itemMap.put(4,"Burger dla vegan 0% mięsa");
       itemMap.put(5,"Orzeźwiający napój");
       itemMap.put(6,"Woda w butelce");
       itemMap.put(7,"Przepyszne świeżo usmażone frytki");
       itemMap.put(8,"Kawałki kurczaka");

       itemMap.entrySet().stream().filter(map-> map.getKey().equals(choice)).forEach(System.out::println);

    }
 
}
