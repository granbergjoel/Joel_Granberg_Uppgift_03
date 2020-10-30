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

    public static int[] addApples(int[] addingApples, int apples, int price){
        for (int i = 0; i <apples ; i++) {
            addingApples[i]=price;
        }

        return addingApples;}


    public static int[] addPears(int[] addingPears,int startIndex, int pears, int price){
        for (int i = startIndex; i <(startIndex+pears) ; i++) {
            addingPears[i]=price;
        }

        return addingPears;}


    public static int finalSum(int[]cart, int lenght){
        int sum=0;
        for (int i = 0; i < lenght; i++) {
            sum=sum+cart[i];
        }

        return sum;
    }

}
