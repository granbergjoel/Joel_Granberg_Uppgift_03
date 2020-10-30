import java.util.Scanner;

/**
 * Created by: Stina
 * Date: 2020-10-30
 * Time: 14:07
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Apple apple=new Apple();
        Pear pear=new Pear();
        String answer;

        while (true) {
            System.out.println("--- Välkommen till Farmen Äpplen och Päron ---");
            System.out.println("Priset på äpplen beror på dagsformen"); //TODO string.format med klassanrop?

            System.out.println("Hur många äpplen ska du sälja: ");
            while (true){
            try {
                apple.amount= scan.nextInt();
                break;
            } catch (Exception e) {
                scan.next();
                System.out.println("Något blev fel, du får bara skriva heltal. Försök igen.");
                System.out.println("Hur många äpplen ska du sälja: ");

            }
            }
            System.out.println("Vad kostar äpplen idag: ");


            while (true) {
                try {
                    apple.priceOfApples=scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, du får bara skriva heltal. Försök igen:");
                    System.out.println("Vad kostar äpplen idag: ");
                }
            }


            System.out.println("Hur många päron ska du sälja: ");

            while (true) {
                try {
                    pear.amount=scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, du får bara skriva heltal. Försök igen:");
                    System.out.println("Hur många päron ska du sälja");
                }
            }

            System.out.println("Vad kostar päron idag: ");

            while (true) {
                try {
                    pear.priceOfPears=scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Något blev fel, du får bara skriva heltal. Försök igen:");
                    System.out.println("Vad kostar päron idag:");
                }
            }

            int lengthOfArray= apple.amount + pear.amount;

            int[] cart = Shoppingcart.basket(lengthOfArray);


            Shoppingcart.addApples(cart,apple.amount, apple.priceOfApples);

            Shoppingcart.addPears(cart,apple.amount,pear.amount, pear.priceOfPears);


            int cartTotal = Shoppingcart.finalSum(cart,cart.length);

            System.out.println(cartTotal);

            System.out.format("Du har sålt %dst äpplen och %dst päron." +
                    "\nPriset för äpplen är %d kr." +
                    "\nPriset för päron är %d kr." +
                    "\nTotala summan blir %d kr",apple.amount,pear.amount,apple.priceOfApples,pear.priceOfPears,cartTotal);


            System.out.println("\nSkriv 'J' för att handla igen eller 'N' för att avsluta");
            answer=scan.nextLine();
            //TODO Varför hoppar den över detta steg? skräp kvar i stack?
            while (true) {


                if (answer.equalsIgnoreCase("j")) {

                    break;
                } else if (answer.equalsIgnoreCase("n")) {


                    System.out.println("Tack för idag!");
                    System.exit(0);
                }
                System.out.println("\nSkriv 'J' för att handla igen eller 'N' för att avsluta");
                answer=scan.nextLine();

            }


        }


        //TODO lägg till en loop, fråga om de vill handla mer.

    }
}
