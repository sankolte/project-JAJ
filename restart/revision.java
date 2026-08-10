package restart;

// public class revision {   // main classs he ye 
//     public static void main(String args[]){   // and this is main method > now dekh this is static > it mesns > belongs to  class and not to objrct void menas > this methf will return noting and mai is toh name of method 

//         System.out.println("hii my name is sanskar ");

//     }
// }

// // static tha issliye verna this is also possible

// public class revision{
//     void greet(){
//         System.out.println("hii");
//     }

//     public static void main(){
//         revision obj = new revision();
//         obj.greet();

//     }
// }
// // aisa   >> ye pura concept of static is coverd in notes >>

// add two nums

// import java.util.*;

// public class revision{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter fist num: ");
//         int a = sc.nextInt();
//         System.out.println("Enter second num : ");
//         int b = sc.nextInt();

//         int c = a+b;
//         System.out.println("The Result of the addition is" + c);

//     }
// }


//odd or even number code 

// import java.util.*;
// public class revision{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number");
//         int num = sc.nextInt();
//         if((num % 2)==0){
//             System.out.println(num+"is a even number");
//         }
//         else{
//             System.out.println("number is odd");
//         }
//     }
// }

// Ternary operators

import java.util.*;

public class revision{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        String result = ((num % 2)==0) ? "even":"odd";
        System.out.println("num is "+result);
    }
}

///////////////////////////////////
/// ARRAYS 
// simple array traversal cha code lihuya

public class main{
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[2]=2;
        arr[3]=4;
        arr[4]=5;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

public class main{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// linear search 

public class main{
    public static void main(String args[]){
        int arr[]={22,13,11,7,8};
        // int target=13;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        for (int i =0; i<arr.length;i++){
            if (target==arr[i]){
                System.out.println("Traget us at index"+i);
            }
        }
    }
}

