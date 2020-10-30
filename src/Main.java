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

        System.out.println("--- Välkommen till Farmen Äpplen och Päron ---");
        System.out.println("Priset på äpplen beror på dagsformen"); //TODO string.format med klassanrop?

        System.out.println("Hur många äpplen vill du köpa: ");
        apple.amount= scan.nextInt();

        System.out.println("Vad kostar äpplen idag: ");
        apple.priceOfApples=scan.nextInt();//TODO felsök för doubles


        System.out.println("Hur många päron vill du köpa: ");
        pear.amount=scan.nextInt();

        System.out.println("Vad kostar päron idag: ");
        pear.priceOfPears=scan.nextInt();//TODO felsök för doubles

        int lengthOfArray= apple.amount + pear.amount;

       int cart[]= Shoppingcart.basket(lengthOfArray);

        //TODO Metodanrop () för att lägga till äpplen
        Shoppingcart.addApples(cart,apple.amount, apple.priceOfApples);
        //Todo Metodanrop () för att lägga till päron
        

        System.out.println("Slutet på programmet");
    }
}
