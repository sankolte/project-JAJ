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

