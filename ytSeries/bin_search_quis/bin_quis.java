package ytSeries.bin_search_quis;

import java.util.Scanner;

public class bin_quis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,4,5,6,8,10};
        int target=sc.nextInt();

        int[]letters={'w','e','r'};
        
        //Ceiling of the num prob
        Ceiling(arr, target);
        
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------


// QUIS 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Ceiling of the number 
    static int Ceiling(int[]arr,int target){
         int start=0;
        int end=arr.length-1;
       
        // firslty wo pehele cond : where bascially celeing == target : simple bin searcrh >>> 

        while(start<=end){
            int mid=start+(end-start)/2;
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
        return arr[start];                            // ye pura logic covered in handwritten notees >>: its just about dryrunning the code

    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------------

    // QUIS 2>>>>>>>>>>>>>>>>>>>>>>>>> 744. Find Smallest Letter Greater Than Target https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

     static char nextGreatestLetter(char[]letters , char target){
        // firslty uss char ko find karna pdega na : toh simple bin search 

        int start =0;
        int end= letters.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target >letters[mid]){
                start=mid+1;
            }
            else if(target<letters[mid]){
                end =mid-1;
            }
        }
        if(start==letters.length){
            return letters[0];
        }

        return letters[start];

     }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------

// QUIS 3 >>>>>>>>>>>>>>>>>>>>>>>>>>      34. Find First and Last Position of Element in Sorted Array    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/





}
