package Less14;

public class Less14 {

    public static void main(String[] args) {

        Drink drink = new Drink("BubbleCoffe",Size.LARGE,450,true);
        Drink drink1 = new Drink("Latte",Size.SMALL,450,true);

    drink.changeAvailability(false);
        System.out.println(drink.comparePrice(drink1));

        System.out.println(drink.isAffordable(2500));
        System.out.println(drink.calculateDiscountedPrice(20.0));

        System.out.println(drink);


    }



}
