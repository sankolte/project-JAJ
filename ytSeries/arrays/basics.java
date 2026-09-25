package ytSeries.arrays;
import java.util.Arrays;

import java.util.Scanner;

public class basics {
     
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String[] name = new String[5];
        for(int i = 0;i<5;i++){
            name[i]= sc.next();
        }
        // for(int i=0;i<5;i++){
        //     System.out.println(name[i]);
        // }
    }
    // int[] roll_no = new int[5];
    // String[] name = new String[4];

   // how to take input ??
//     Scanner sc = new Scanner(System.in);

//     int[] arr= new int[5];

//    for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();


//    }


    // one easy way to print the array is :

    for(int a : arr){
        System.out.println(a);
    }
/*  here a - variable means the it represents each and every elemenet in the array
     and then " : arr "  like name of array and then print a >> isse whole array will get printed*/

    // one more way to print 

    system.out.println(Arrays.tostring(arr));
 // buss we have to import the Arrays class ( the inbuilt class of java) and then we can use this mehtod 
 // likebascially here arrays ko string me convertt karke and then print 

}

// paasing arrays in function >>>>

// lets scooby do this 


