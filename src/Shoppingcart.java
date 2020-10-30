/**
 * Created by: Stina
 * Date: 2020-10-30
 * Time: 14:13
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Shoppingcart {



    public static int[] basket(int lenght){
            int basket[]=new int[lenght];
            return basket;
    }
    //TODO metod som lägger till äpplen i basket
    public static int[] addApples(int[] addingApples, int apples, int price){
        for (int i = 0; i <apples ; i++) {
            addingApples[i]=price;
        }

        return addingApples;}

    //TODO metod som lägger till päron i basket
    public static int[] addPears(int[] addingPears,int startIndex, int pears, int price){
        for (int i = 0; i <pears ; i++) {
            addingPears[i]=price;
        }

        return addingPears;}
    //metod som räknar ut innehållet i korgen

}
