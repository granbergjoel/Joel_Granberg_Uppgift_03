import java.util.Scanner;

/**
 * Created by: Joel
 * Date: 2020-10-30
 * Time: 14:07
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Apple apple = new Apple();
        Pear pear = new Pear();
        int amountOfApples;
        int answer;

        /**
         * Programmet hålls igång av en loop som stängs i slutet om användaren vill
         */
        while (true) {
            System.out.println("--- Välkommen till Farmen Äpplen och Päron ---");
            System.out.println("Priset på äpplen beror på dagsformen");//TODO ändra till statiska värden i klassen

            /**
             * Första segmentet samlar in data om mängd och pris samt initerar klasserna Apple och Pear med dessa.
             * Try/catch används för att användaren inte ska skriva in felaktig data.
             */
            System.out.println("Hur många äpplen ska du sälja: ");//TODO metodanrop till Apple, return amount
            while (true) {
                try {
                    answer=scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, du får bara skriva heltal. Försök igen.");
                    System.out.println("Hur många äpplen ska du sälja: ");
                }
            }
            apple.howManyApples(answer);
            amountOfApples=apple.getApple();//TODO använda denna i uträkning nedan
           /* System.out.println("Vad kostar äpplen idag: ");//TODO ta bort dessa rader

            while (true) {
                try {
                    apple.priceOfApples = scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, du får bara skriva heltal. Försök igen:");
                    System.out.println("Vad kostar äpplen idag: ");
                }
            }*/

            System.out.println("Hur många päron ska du sälja: ");//TODO anropa Pear, return amount

            while (true) {
                try {
                    pear.amount = scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, du får bara skriva heltal. Försök igen:");
                    System.out.println("Hur många päron ska du sälja");
                }
            }

            System.out.println("Vad kostar päron idag: ");//TODO ta bort

            while (true) {
                try {
                    pear.priceOfPears = scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, du får bara skriva heltal. Försök igen:");
                    System.out.println("Vad kostar päron idag:");
                }
            }

            /**
             * Andra segmentet kör alla metoder
             * Skapar en varukorg (cart)
             * Fyller den med Apple och sedan med Pear
             * Räknar ut värdet av alla produkter i varukorgen och ger användaren resultatet
             */
          /*  int lengthOfArray = apple.amount + pear.amount;

            int[] cart = Shoppingcart.basket(lengthOfArray);

            Shoppingcart.addApples(cart, apple.amount, apple.priceOfApples);

            Shoppingcart.addPears(cart, apple.amount, pear.amount, pear.priceOfPears);

            int cartTotal = Shoppingcart.finalSum(cart, cart.length);

            System.out.println(cartTotal);

            System.out.format("Du har sålt %dst äpplen och %dst päron." +
                    "\nPriset för äpplen är %d kr." +
                    "\nPriset för päron är %d kr." +
                    "\nTotala summan blir %d kr", apple.amount, pear.amount, apple.priceOfApples, pear.priceOfPears, cartTotal);
                    */


            /**
             * I tredje segmentet får användaren välja att avsluta eller fortsätta
             * Detta görs med en switch som antingen börjar om loopen eller bryter programmet
             */
            while (true) {
                try {
                    System.out.println("\nSkriv '1' för att handla igen eller '2' för att avsluta.");
                    answer = scan.nextInt();
                    if (answer == 1 || answer == 2)
                        break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, försök igen.");
                }
            }

            switch (answer) {
                case 1:
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }
}
