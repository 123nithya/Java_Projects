/*

PROBLEM-STATEMENT:
    There is a pizza restaurant that makes pizza. The restaurant have 2 types of pizza,
    the first kind of pizza is the normal pizza you can add like the base a variant of any
    pizza and then the other kind of pizza that the restaurant have is the deluxe one.
    The base one have veg and noe-veg, let's say the prize is 400, this is the prize of the base pizza
    and there are few add-ons that you can. First add on that you can add is extra cheese it costs you rs.100
    and second is extra toppings the prize is extra 100rs. There are two features in the restaurant
    one is take-away and the other one is dinning. If you opt take-away means then extra rs.20 for the back-pack.

    You have to give the freedom to the user that you can order a pizza, and then you can add a few add-ons
    if you want to extra toppings cheese (or) you out either want to take-away or dine in you choose whatever
    you want, and then you run the application then you get the bill of that particular pizza. We have deluxe
    pizza also have variant of non-veg and veg. Going through the deluxe pizza we don't have any options for
    extra toppings or cheese, because if you order deluxe pizza it already has extra cheese and toppings.
    And there is an option for take-away and dine. This is the moto of the application.

    [USING OOPS CONCEPT]

 */

package Pizza_Bill_Generator;

import java.util.Scanner;

public class PizaBillGenerator {
    public static void main(String[] args) {
//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
//        dp.addExtraCheese();
//        dp.addExtraToppings();
        dp.takeAway();
        dp.getBill();
    }
}
