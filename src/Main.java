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
        double appleCost;
        int amountOfPears;
        double pearCost;
        int answer;

        /*
          Programmet hålls igång av en loop som stängs i slutet om användaren vill
         */
        while (true) {
            System.out.println("--- Välkommen till Farmen Äpplen och Päron ---");
            System.out.println("Priset på äpplen beror på dagsformen");
            System.out.println("Du kan när som helst avsluta programmet med Ctrl-D (EOF)");

            /*
              Första segmentet samlar in data om mängd sålda produkter.
              Metodanrop används då klassernas variabler är statiska
             */
            System.out.println("Hur många äpplen ska du sälja: ");
            apple.setAmount();
            amountOfApples = apple.getApple();
            appleCost = apple.getPRICEOFAPPLES();

            System.out.println("Hur många päron ska du sälja: ");
            pear.setAmount();
            amountOfPears = pear.getPear();
            pearCost = pear.getPRICEOFPEARS();

            /*
              Andra segmentet räknar ut värdet av alla produkter i som säljs och ger användaren resultatet
             */
            System.out.format("Du har sålt %dst äpplen och %dst päron." +
                            "\nPriset för äpplen är %.2f kr." +
                            "\nPriset för päron är %.2f kr." +
                            "\nTotala summan blir %.2f kr", apple.getApple(), pear.getPear(), apple.getPRICEOFAPPLES(),
                    pear.getPRICEOFPEARS(),(apple.getApple()*apple.getPRICEOFAPPLES()+(pear.getPear()*pear.getPRICEOFPEARS())));

            /*
              I tredje segmentet får användaren välja att avsluta eller fortsätta
              Detta görs med en switch som antingen börjar om loopen eller bryter programmet
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
