import java.util.ArrayList;
import java.util.Scanner;

public class HealthyBurger extends Hamburger{
    public HealthyBurger(String meat) {
        super.name = "Healthy Burger";
        super.breadRoll = "Brown Rye Bread Roll";
        super.meat = meat;
        super.additions = new ArrayList<>();
        super.additionPrices = new ArrayList<>();
        super.basePrice = 22;
        super.finalPrice = basePrice;

        System.out.println("Thank you for ordering a " + this.name + "." +
                "\nYou can add up to six more ingredients to your burger.\n");
    }

    @Override
    public void addExtras() {
        System.out.println("Choose up to six extra ingredients.\n");
        Choose:
        while (additions.size() < 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("You added " + additions.size() + " out of 6 extras for your Hamburger.");
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
                    10. Premium Vegetable Mix
                    11. Yoghurt Sauce
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
                case 10 -> {
                    additions.add("Premium Vegetable Mix");
                    additionPrices.add(5);
                    finalPrice += 5;
                }
                case 11 -> {
                    additions.add("Yoghurt Sauce");
                    additionPrices.add(2);
                    finalPrice += 2;
                }
                case 0 -> showPrice();
                case -1 -> {
                    break Choose;
                }
                default -> System.out.println("Wrong input. Try again!");
            }
        }
    }
}
