import java.util.Scanner;

public class Terminal {
    public Terminal() {
    }

    public void greeting() {
        System.out.println("Witamy w terminalu");
        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;
        MenuList menuList = new MenuList();
        UserBasket userBacket = new UserBasket();

        while (shouldContinue) {

            System.out.println("Wybierz jedna z opcji:");
            System.out.println("1. Zobacz menu");
            System.out.println("2. Zobacz koszyk");
            System.out.println("3. Złóż zamówienie");
            System.out.println("4. Zobacz opisy naszych dań");
            System.out.println("5. Wyjdź");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> menuList.displayMenu();
                case 2 -> userBacket.displayBasket();
                case 3 -> userBacket.addItem();
                case 4 -> menuList.displayDescription(userChoice);
                case 5 -> shouldContinue = false;

            }
        }
    }
}