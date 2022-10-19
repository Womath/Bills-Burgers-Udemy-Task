import java.util.ArrayList;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super.name = "Deluxe Burger";
        super.breadRoll = "Classic Bread Roll";
        super.meat = "Beef";
        super.additions = new ArrayList<>();
        additions.add("Chips");
        additions.add("Cola");
        super.additionPrices = new ArrayList<>();
        additionPrices.add(8);
        additionPrices.add(5);
        super.basePrice = 18;
        super.finalPrice = basePrice;

        for (int i = 0; i < additions.size(); i++) {
            finalPrice += additionPrices.get(i);
        }

        System.out.println("Thank you for ordering a " + this.name + ".");
        showPrice();
    }
}
