package ytSeries.searching_tech;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        // code for liner search 
        /*  --> take a array 
            --> initilaize a target ( fron user of hardcode it)
            --> traverse a array for(int i to arr.length)
            --> where if(arr[i]==target) then --> return i;
            --> khatam
        */

            // int[]arr={1,44,5,2,4,5};
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter Traget to be searched:");
            // int target = sc.nextInt();

            // for(int i=0;i<arr.length;i++){
            //     if(arr[i]==target){
            //         System.out.println("Target is at index: " + i);
            //     }
            // }

            int[]arr={1,44,5,2,4,5};
            Scanner sc = new Scanner(System.in);
                 System.out.println("Enter Traget to be searched:");
                 int target = sc.nextInt();
               int result = Linear_Search(arr,target);
               System.out.println(result);
            
        }

        static int Linear_Search(int[]arr,int target){
                
                 for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
                }
            }
                return -1;     //ye bhi imp :- coz id nahi mila toh should return -1
        }



// quis 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FINDING CHAR IN A STRING

//we can also do this for string and finding a char in a string 
/*

String name = "Sanskar";
char target = sc.next().charAt(0);

static boolean search(String str , char target){

    for(int i =0 ; i<str.lenght ; i++){
    
        if(target==str.charAt(i)){

        return true;
        
        }
    }
        

}
--------------------------------------------------------------------------------------------------------------------------------------------
*/


//  quis 2 >>>>>>>>>>>>>>>>>>>>>>>>  LINEAR SEARCH IN A RANGE

// ( just wrriting a function here baki ka writeen in psvm)

static int linear_search_range(int target, int start,int end, int[]arr){
        // pvsm me ye sab ka vlaues le lena sc.nextint() and array bhi le lena 
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
}

//---------------------------------------------------------------------------------------------------------------------------------------------------

// quis 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  MINIMUM IN THE ARRAY 

    static int min_element(int arr[]){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                return arr[i];
            }
        }
        return -1;
    }
//-------------------------------------------------------------------------------------------------------------------------------------------------------

// quis 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  SEARCHING IN 2D ARRAY 

    static int[] search_in_2d_Araay(int[][]arr ,int target){
            for(int rows=0;rows<arr.length;rows++){
                for(int cols=0;cols<arr[rows].length;cols++){
                    if(arr[rows][cols]==target){
                      return new int[]{rows, cols};                             // basically here see humne method ko hi array return karyava he  >> yeah this is what we do >> 
                    }
                }
            }
            return new int []{-1,-1};
           
    }
//----------------------------------------------------------------------------------------------------------------------------------------------

// quis 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/   :Find Numbers with Even Number of Digits

    



    }

