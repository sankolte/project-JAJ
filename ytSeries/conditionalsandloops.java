package ytSeries;

 import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

// public class conditionalsandloops {
//     public static void main(String[] args) {
//         int salary=2000;
//         if(salary>1000){
//             salary=salary+2000;
//         } else if (salary>1500){
//             salary=salary+5000;
//         }else{
//             salary=salary+10000;
//         }
//         System.out.println("The final salary is "+salary);
//     }
// }


// // loops >>

// for(int i=0;i<=10;i++){
//     System.out.println(i);
// }

// // while loops
// int num =1;
// while(num<=5){
//     System.out.println(num);
//     num++;
// }
// // u nned while loop > when u dont know how many times the loop os gonna run like jab itterations pata nahi ho tab while loop


// // do while loop

// int n=1;  // here also like intiliaztion upper he kar dene ka
// do{
//     System.out.println(n);
//     n++;
// }while(n<=10);

// // here bascially kuch bhi kar lo ekk bar to bhi hog ahi run like "1" print hoga hi and wo increment bhi hoga like it will exicute atleast once 

// // larfest of the 3 numbers 

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();
// if(a>b){
//     System.out.println("a is the greaest");
    
// } else if(b>c){
//     System.out.println("b is the greatest");
// }else{
//     System.out.println("c is the greatest ");
// }
// // idhar sout for enetering numbers can be alsp used >>'

// //or

// int max =a;  //assuming 
// if(b>max){
//     max=b;
// }
// if(c>max){
//     max=c;
// }
// System.out.println(max);


// int maxNumber = Math.max(c,Math.max(a,b));
// this will simply give us largest >>

//------------------------------------------------------------------------

// we enetr a char > and program will tell is that char uppercase or lowercase

// public class conditionalsandloops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char ch = sc.next().trim().charAt(0);       // basically see we dont have a seprate scanner thing for char ( like string ke lye he but not for char) so here humne string input liya and then > usko trim kiya ( removing spaces ) and ekk methid use kiya charAt(0) basicllay this method gives us a perticular charector at any given index from the string 

//         if((ch >= 'a')&&(ch <= 'z')){
//             System.out.println("Lowercase char");
//         }else{
//             System.out.println("uppercase char");
//         }
//     }

// }


//--------------------------------------------------------------------------------

//      FIBONACCI SERIES
// bascially quis >> find the nth fibonaci number >> n user se lenge 

/*
int fib;
int curr =0;
int first=0;
int sec=1;
 for (int i=2 to n){ 
    int curr =(i-1)+(i-2);
    curr+=curr;
    
}
    fib = curr + first +sec;
    sout(fib);
 
*/
// ahh this was utter bullshit..


public class conditionalsandloops {

    public static void main(String[] args) {
         int first=0;
         int sec=1;
         int next;
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i=2; i<=n;i++){
            next = first + sec ;
            first=sec;
            sec=next;

         }
         System.out.println(sec);

    }
}

 //---------------------------------------------------------------

 // finding occuwnce of the digit in the number

//  int num = 1234567123;
// int digit = 2;
// int count = 0;

// while (num > 0) {
//     int lastDigit = num % 10;

//     if (lastDigit == digit) {
//         count++;
//     }

//     num = num / 10;
// }

// System.out.println(count);


//-----------------------------------------------------------------------------

// revrse fo the number 

// int num = 1234567;
// int reverse = 0;

// while (num > 0) {
//     int digit = num % 10;
    
//     reverse = reverse * 10 + digit;
    
//     num = num / 10;
// }

// System.out.println(reverse);

//----------------------------------------------------------------------





public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }
}