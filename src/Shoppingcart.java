/**
 * Created by: Joel
 * Date: 2020-10-30
 * Time: 14:13
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Shoppingcart {


    /**
     * @param lenght = mängden äpplen + päron
     * @return shoppingvagn i form av en array
     */
    static double[] basket(int lenght) {
        double[] basket = new double[lenght];
        return basket;
    }

    /**
     * @param addingApples tar in shoppingvagnen cart
     * @param apples       =mängden äpplen
     * @param price        lagras i varukorgen
     * @return cart är nu laddad med alla äpplen
     */
    public static double[] addApples(double[] addingApples, int apples, double price) {
        for (int i = 0; i < apples; i++) {
            addingApples[i] = price;
        }

        return addingApples;
    }

    /**
     * @param addingPears tar åter in shoppingvagnen cart
     * @param startIndex  = mängden äpplen +1 för att inte skriva över några äpplen i korgen
     * @param pears       = mängden päron
     * @param price       lagras i varukorgen
     * @return cart är nu ladda med BÅDE äpplen och päron
     */
    public static double[] addPears(double[] addingPears, int startIndex, int pears, double price) {
        for (int i = startIndex; i < (startIndex + pears); i++) {
            addingPears[i] = price;
        }

        return addingPears;
    }

    /**
     * @param cart   tar in den fulla varukorgen
     * @param lenght mängden produkter i korgen
     * @return summan av priset på produkterna i varukorgen
     */
    public static double finalSum(double[] cart, int lenght) {
        double sum = 0;
        for (int i = 0; i < lenght; i++) {
            sum = sum + cart[i];
        }

        return sum;
    }

}
