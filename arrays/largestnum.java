package arrays;
import java.util.*;


public class largestnum {

    public static int largest(int arr[],int largest){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }

        }
        return largest;
        

    }
    public static void main(String args[]){
        int arr[]={22,4,67,32,99};
        int largest=Integer.MIN_VALUE;
      int largestNum=  largest(arr,largest);

        System.out.println("The largest number in the array is " + largestNum);
    }
}
