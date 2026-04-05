package arrays_2;
import java.util.*;

public class trappingwater {

    public static int rainwater(int arr[]){
        //find auxilary arrays > left max boundary , right max bounadary
        int n =arr.length;

        //finnding leftmax

        int leftmax[]=new int [n];

        leftmax[0]=arr[0];

        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);

        }
        
        //finding right max
        int rightmax[]= new int [n];

        rightmax[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);      //pura ulta >>

        }

        int trappedwater=0;

        for(int i=0;i<n;i++){
            int waterlevel=Math.min(rightmax[i],leftmax[i]);

            trappedwater+=waterlevel-arr[i];
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};

        int result =rainwater(arr);


        System.out.println("Total trapped water is " + result);
    }
}
