import java.util.*;
import java.lang.*;

/**
 * Created by: Joel
 * Date: 2020-10-30
 * Time: 14:11
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Apple {
    private int amount;
    private final double PRICEOFAPPLES= 4.90;
    Scanner scan = new Scanner(System.in);

    /*
     * Klassen innehåller Metoder som tar emot data från användaren, initierar instansvariabler och returnerar dessa.
     * Try/catch används för att användaren inte ska skriva in felaktig data.
     */

    /**
     * Avänds för att bestämma antal äpplen inne i klassen
     */
    public void setAmount(){

        while (true) {
            try {
                amount=scan.nextInt();
                break;
            } catch (Exception e) {
                scan.next();
                System.out.println("Något blev fel, du får bara skriva heltal. Försök igen.");
                System.out.println("Hur många äpplen ska du sälja: ");
            }
        }

    }

    /**
     * @return skickar antalet äppen till main
     */
    public int getApple() {
                return amount;
    }
    /**
     * @return skickar priset på äppen till main
     */
    public double getPRICEOFAPPLES(){
        return PRICEOFAPPLES;
    }
}


