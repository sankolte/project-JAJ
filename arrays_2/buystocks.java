package arrays_2;
import java.util.*;
 
public class buystocks {

    public static int maxprofit(int prices[]){
        int buyprices=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(buyprices<prices[i]){
                int profit=prices[i]-buyprices;
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
                buyprices=prices[i];
                //iss din lo bhai stocks>>>
            }
        }
        return maxprofit;

    }


    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int result=maxprofit(prices);
        System.out.println("The max profit is "+result);
    }
}
