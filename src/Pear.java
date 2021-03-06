import java.util.*;
import java.lang.*;

/**
 * Created by: Joel
 * Date: 2020-10-30
 * Time: 14:11
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


public class Pear {
    private int amount;
    private final double PRICEOFPEARS = 5.90;
    Scanner scan = new Scanner(System.in);

    /*
     * Klassen innehåller Metoder som tar emot data från användaren, initierar instansvariabler och returnerar dessa.
     * Try/catch används för att användaren inte ska skriva in felaktig data.
     */

    /**
     * Sätter antalet päron i klassen
     */
    public void setAmount() {
        while (true) {
            try {
                amount = scan.nextInt();
                break;
            } catch (Exception e) {
                scan.next();
                System.out.println("Något blev fel, du får bara skriva heltal. Försök igen.");
                System.out.println("Hur många päron ska du sälja: ");
            }
        }
    }

    /**
     * @return skickar antalet päron till main
     */
    public int getPear() {
        return amount;
    }

    /**
     * @return skickar pris på päron till main
     */
    public double getPRICEOFPEARS() {
        return PRICEOFPEARS;
    }
}
