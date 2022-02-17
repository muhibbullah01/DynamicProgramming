import java.util.*;
import java.util.Vector;

public class MinimumNumberofCoins {
    int k = 0;
    int[] coins = {1,2,5,10,25};

    public MinimumNumberofCoins(int cost){
        Vector<Integer> coinList = new Vector<>();
        for(int i=coins.length - 1; i>=0; i--){
            while (cost>=coins[i]){
                cost -= coins[i];
                coinList.add(coins[i]);
            }
        }
        while (k<coinList.size()){
            System.out.print(" " + coinList.elementAt(k));
            k++;
        }
    }

    public static void main(String[] args){
        MinimumNumberofCoins obj = new MinimumNumberofCoins(23);
    }
}
