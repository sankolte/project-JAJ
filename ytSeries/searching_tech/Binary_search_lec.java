package ytSeries.searching_tech;

import java.util.Scanner;

// binary search code
public class Binary_search_lec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={3,5,6,7,24,34,66};
        int target=sc.nextInt();

       int result= binary_search(arr, target);
       System.out.println(result);


        order_agnostic_BS(arr,target);
    }




    static int binary_search(int[]arr,int target){
        
        int start=0;
        int end=arr.length-1;
       
        
        while(start<=end){
            int mid=start+(end-start)/2;                       //better way to fiding mid : this does not go out of the range>> 


            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;

            }
        }
        return -1;
    }


//------------------------------------------------------------------------------------------------------------------------------------------------------------

//                         ORDER AGNOSTIC BINARY SEARCH >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
/* here in normal array we knew ki array is sorted right : but what if araay is in acedning or descending   */

    static int order_agnostic_BS(int[] arr , int target){
         int start=0;
        int end=arr.length-1;
        // abb find out karna pdega ki ascending he ki descending he >>given sortedd array 

       
    }

    static boolean ascending(int arr[], int start, int end ){
        if(arr[start]>arr[end]{
            return 
        })
    }


}
