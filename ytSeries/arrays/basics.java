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

/*

public static void main(String[] args){

    int[] nums={11,66,34,5};
    sout(Arrays.tostring(nums));               o/p :: 11,66,34,5

    change(nums);                                

    sout(Arrays.toString(nums));

}

void change(int[] arr){

    arr[0]=3;
    arr[1]=2;

}

see here concept :::::::::

initially see reference variable "nums" was pointing to the array right nums--->[11,66,34,5] 
now see change(nums) --> redirect to function 
change(int[]arr)  toh here we know arr is just a copy of the ref variable nums right 
so un heap both arr and nums are refereing to same object 

nums-->[11,66,34,5]<--arr
toh if 

    arr[0]=3;
    arr[1]=2;

    i do this in arr wo nums me bhi chnage hoga ---> coz both same hi he >>>>.

    (abb ye non premitive he issliye hogaya if primitive hoga toh nhi hota ok)

*/


