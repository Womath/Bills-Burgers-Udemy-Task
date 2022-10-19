import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Welcome to Bill's Burgers! Choose from the menu!\n");
            System.out.println("""
                    Menu:
                    1. Classic Burger (Classic Bread Roll, Meat of your choice, up to 4 additions)
                    2. Healthy Burger (Brown Rye Bread Roll, Meat of your choice, up to 6 additions)
                    3. Deluxe Burger (Classic Bread Roll, Beef, Chips and Cola)
                    0. Exit
                                    
                    """);
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();

            switch (i) {
                case 1 -> {
                    Hamburger hamburger = new Hamburger(chooseMeat());
                    hamburger.addExtras();
                    hamburger.showPrice();
                    System.out.println("Thank you for your order!\n");
                }
                case 2 -> {
                    Hamburger healthyBurger = new HealthyBurger(chooseMeat());
                    healthyBurger.addExtras();
                    healthyBurger.showPrice();
                    System.out.println("Thank you for your order!\n");
                }
                case 3 -> {
                    Hamburger deluxeBurger = new DeluxeBurger();
                    System.out.println("Thank you for your order!\n");
                }
                case 0 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }
        }

    }

    public static String chooseMeat() {
        System.out.println("""
                        Choose your meat:
                        1. Beef
                        2. Chicken
                        3. Fish
                        """);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        return switch (i) {
            case 1 -> "Beef";
            case 2 -> "Chicken";
            case 3 -> "Fish";
            default -> "Special Meat";
        };
    }
}