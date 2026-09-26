package ytSeries.arrays;
import java.util.Arrays;


public class quis {
    // public static void main(String[] args) {
    //     //swap 

    //       int arr[]= {22,33,4,5};
    //      swap(arr,1,2);

    //      System.out.println(Arrays.toString(arr));
    // }

    // static void swap(int[] arr, int index1, int index2){          // static lagaya coz :-- hume wo direct call larna he na in psvm hume object banak nahi karna toh thats why static like here direct belongs to class 
    //    int temp = arr[index1];
    //    arr[index1] = arr[index2];
    //    arr[index2]=temp;
    // }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//     public static void main(String[] args) {
//         // max element in the array

//          int arr[]= {22,33,4,5};
//             // max(arr);
//            System.out.println(max(arr));

//     }

//     static int max(int[]arr){
//       int greatest= arr[0];

//       for(int i=1;i<arr.length;i++){
//         if(arr[i]>greatest){
//             greatest=arr[i];
//         }
//         if(arr==null){
//             return -1;
//         }
//         if(arr.length==0){
//             return -1;
//         }
//       }
//       return greatest;
//     }
//---------------------------------------------------------------------------------------------------------------------------------------------

// Reverse the array
public static void main(String[] args){

    int[]arr={23,2,3,4,1};

    reverse(arr);

    System.out.println(Arrays.toString(arr));

}


 static void swap(int[] arr, int index1, int index2){          // static lagaya coz :-- hume wo direct call larna he na in psvm hume object banak nahi karna toh thats why static like here direct belongs to class 
       int temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2]=temp;
    }

static void reverse(int arr[]){
    int start =0;
    int end = arr.length-1;

    while(start<end){
        swap(arr, start, end);
        start++;
        end--;

    }
}

}


