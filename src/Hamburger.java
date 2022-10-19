import java.util.ArrayList;
import java.util.Scanner;

public class Hamburger {
    String name;
    String breadRoll;
    String meat;
    ArrayList<String> additions;
    ArrayList<Integer> additionPrices;
    int basePrice;
    int finalPrice;

    public Hamburger() {
    }

    public Hamburger(String meat) {
        this.name = "Classic Burger";
        this.breadRoll = "Classic Bread Roll";
        this.meat = meat;
        this.additions = new ArrayList<>();
        this.additionPrices = new ArrayList<>();
        this.basePrice = 18;
        this.finalPrice = basePrice;

        System.out.println("Thank you for ordering a " + this.name + "." +
                "\nYou can add up to four more ingredients to your burger.\n");
    }

    public void addExtras() {
        System.out.println("Choose up to four extra ingredients.\n");
        Choose:
        while (additions.size() < 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You added " + additions.size() + " out of 4 extras for your Hamburger.");
            System.out.println("""
                    Choose what you want to add:
                    1. Tomato
                    2. Onion
                    3. Lettuce
                    4. Cheese
                    5. Cabbage
                    6. Arugula
                    7. Jalapeno
                    8. Egg
                    9. Burger Sauce
                    0. Show Price
                    -1. Exit
                    """);

            int i = scanner.nextInt();

            switch (i) {
                case 1 -> {
                    additions.add("Tomato");
                    additionPrices.add(3);
                    finalPrice += 3;
                }
                case 2 -> {
                    additions.add("Onion");
                    additionPrices.add(2);
                    finalPrice += 2;
                }
                case 3 -> {
                    additions.add("Lettuce");
                    additionPrices.add(1);
                    finalPrice += 1;
                }
                case 4 -> {
                    additions.add("Cheese");
                    additionPrices.add(3);
                    finalPrice += 3;
                }
                case 5 -> {
                    additions.add("Cabbage");
                    additionPrices.add(1);
                    finalPrice += 1;
                }
                case 6 -> {
                    additions.add("Arugula");
                    additionPrices.add(4);
                    finalPrice += 4;
                }
                case 7 -> {
                    additions.add("Jalapeno");
                    additionPrices.add(3);
                    finalPrice += 3;
                }
                case 8 -> {
                    additions.add("Egg");
                    additionPrices.add(5);
                    finalPrice += 5;
                }
                case 9 -> {
                    additions.add("Burger Sauce");
                    additionPrices.add(1);
                    finalPrice += 1;
                }
                case 0 -> showPrice();
                case -1 -> {
                    break Choose;
                }
                default -> System.out.println("Wrong input. Try again!");
            }
        }
    }

    public void showPrice() {
        System.out.println(this.name);
        System.out.println("Base price (" + this.breadRoll + ", " + this.meat + "): $" + basePrice);
        for (int i = 0; i < additions.size(); i++) {
            System.out.println(additions.get(i) + ": $" + additionPrices.get(i));
        }
        System.out.println("Total price: $" + this.finalPrice + "\n");
    }
}
