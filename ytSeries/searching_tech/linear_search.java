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
/*see pehele toh given array ke upper itterte karna hoga ok -> where ekk varibale for counting num of numers having even digits "count" aisa -> where pratrk number pe wo perticular numbre me ke digits 
ke sankhya find karne padegi n/10 se and then wo sankya even he ki nhai wo check karna pdega -> if even good (btw wo idhar like number of digits ginne ke liye bhi ekk "count namak variable lagega ")*/
    


// iss wali method ko call karna >>in main method >>
    static int number_having_evenDigit(int[] arr){
        int count=0;
        for(int num : arr){                       // isko samjho short cut of writing for loop 
            if(even_he_kya(num)){
                count ++;
            }
        }
       return count;
    }

    // function for checking ki even he kya number
      static boolean even_he_kya(int num){
       int numberofdigits = number_of_digit(num);
       if(numberofdigits % 2==0){
        return true;
       } 
       return false;
    }

    // function for knowing the number of digits 
     static int number_of_digit(int num){
        // bascially counts the digit in the number : used as a helper function in the even_he_kya function
        int count=0;
        while(num>0){
            count ++;
            num=num/10;  // number meke digit ekk se kam ho jayege>
        }
        return count;
     }

     //----------------------------------------------------------------------------------------------------------------------------------------------------------

     // Quis 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  https://leetcode.com/problems/richest-customer-wealth/description/  ;;;  RICHEST CUSTOMER WHEALTH 
  
/*
Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.

bascally sabse ameer insan kon ? 
[[1,2,3],[3,2,1]]
here wo bade array ke under ekk peritcular array is a insaan ok and wo sab values are his money in diff accountd sab ka sum ki the insan ki whealth

bascailly 

traverse karnae he and herr ekk row pe sum >>>

*/
     
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int[] customer : accounts) {

            int currentWealth = 0;

            for (int money : customer) {
                currentWealth += money;
            }

            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }

        return maxWealth;
    }



    }

  