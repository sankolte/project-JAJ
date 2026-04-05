// public class ka naam and file ka naam same hona chahihye always >>
//hume hamesha do cheese karni padegi public class banan padega and main func banaan padega 


// public class demo{
//     public static void main(String[] args ){        //this is the maon method like whenevr cmpiler riuns the code wo isko searh karta 
//         System.out.print("hello world!!");

//     }
// }
//yaha ye run ho jayega 
//no need of objects and all why ??
//system.out wo he in a static method / func 
//static only belongs to a class and not on object to iss ke liye obj ki jarurat nahi he 

//but if

// public class demo {

//     void greet() {
//         System.out.println("Hello Sanskar");
//     }

//     public static void main(String[] args) {
//         demo obj = new demo();   // Creating object
//         obj.greet();             // Calling method using object
//     }
// }

// variables >>
// a=10 this is variable coz usme ki vlaue change ho saktu he where 10 is called literal i.e jiski value chnage nahi ho sakti jo humesha const raheggi 
// int , float ,double,bool etc   int a=10;
//ye jo bhi naam he like variable ske naam a,b,c uske baad c;ass ka naam demo ye sab these are called IDENTIFIERS
 //if int c=25;  this means java ke memoty me c is the name of the location , where this 25 value is stored 
 // like this can be visualised as a blocks ekk block me 10 stored he then uss block ka naam a  if int a=10;


 // Datatypes >Primitive : jo java me khud se existe karte he .. byte , float ,int,long,char,double,boolean
// > non primitive > jo hum banate he like user defined String,array,class,object,interface

//char ch='a'; 
// boolean var=true;  boolean var=false;\

//long badi value ka integer 
//double badi value of decimal

// 1 byte =1bits 

/////////////////////////////////////////////////////////////////////
//User se INPUT kaise le 

// import java.util.*;
// Scanner sc = new Scanner(System.in);   here Scanner is a class inbuilt class and sc is obj
// String a = sc.next();  ye lega values
// String a =sc.nextLine();  ye pure line ko store karvayga uper ka sirf he word ko store karega
// if integer input lena he to sc.nextInt() banega wo
// nextFloat(); for float

// sum

// import java.util.*;
// public class demo{
//     public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);

//          System.out.print("Enter value of a ");
//          int a= sc.nextInt();
//          System.out.print("Enter value of b ");
//          int b= sc.nextInt();

//          int sum =a+b;  //product ke liye a*b
//          System.out.print(sum); 
    
//     }
// }


// area of circle 

// import java.util.*;

// public class demo{
//     public static void main(String[] args) {
         
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter radius : ");

//         float rad=sc.nextFloat();

//         double area=3.14f*rad*rad;   //whats that f agar bina f ka kare to error that cnat convert double into float >> when conmpiler runs it takes all decimal value as double and not float to float ke liye hum wo f lagte easy

//         System.out.println(area);


//     }
// }


// TYPE CONVERSION 
// for doing conversion destinnation datatype should be more powerful tgan source
// like int --> long possible but  long--> it not possible  ..basically destination datatype ka size bada hina chahiye

//  byte --> short --> int --> float --> long --> double   this is the chain
// we can also  char--> int
// .. in charetcers ki value hoti he 
// float a=sc.nextInt();  ye alowed he like 16 will become 16.00


// TYPE CASTING 
// basically we saw that chain ki konsa datatype kis datatype me convert ho sakta he ok but what if hume uss chain se ulta karnahe 
// what i want o convert float ko int me jo ki karna nahi chaihyethere will be loss of data but hume karnahe 
// its called typecasting
//  float a =12.34f;
// int b = a ;  error ayega so we will type cast
// int b = int (a);
// 12.34 --> 12 bann jaeyga 


//type conversion _. widing conversion
// type casting  __ . narowing conversion 

 
// TYPE PROMOTIONS IN EXPRESSION 

// Type Promotion = automatic conversion of smaller data types into larger data types during 
// int a = 10;
// double b = 5.5;

// double result = a + b;

// What happens?

// a (int) gets promoted to double

// Result becomes double

// No error

//Even if you use byte, short, or char —
// Java converts them to int before doing arithmetic.
// byte a = 10;
// byte b = 20;

// byte c = a + b;   // ❌ ERROR
// fix : int c=a+b;


//char a = 'A';
// char b = 'B';

// System.out.println(a + b);   here char will be promoted to int so outut sill be 65+66=131
//summary >>>>>>>>>>>
// Small types convert to int during arithmetic

// Expression result becomes largest type

// Small → Big automatic

// Big → Small needs casting

//listen jo largest possible datatype he pure code me usme convert ho jayega 
//if long or float, or double he expression me then jo badas usme convert kar dega 
// for eg 
// int a=10;
// float b=10.24;
// long c=23;
// double d=39;

// here double ans=a+b+c+d;
// yes output will be in double coz sabse bada wo he chain me 


/////////////////////////////////////////////////////////////////////////////
// CONDITIONAL STATEMENTS :
// if else > same syntax as js 

//even odd 
// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         int num;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the num:" );
//         num=sc.nextInt();
        
//         if((num % 2)==0){
//             System.out.println("Given num is even");
//         }
//         else {
//             System.out.println("Given num is odd");
//         }
//     }
// }

// Use this editor to write, compile and run your Java code online


//income tax caclulator

// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         int income;
//         float tax;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the income:" );
//         income=sc.nextInt();
        
//         if(income<500000){
//            System.out.println("No income tax");
//         }
//         else if((income>=500000) && (income<=1000000)){
//             tax=income*0.02f;  20 %
//             System.out.println("Tax on ur income will be  : "+tax);
//         }
//         else if((income>=1000000)){
//             tax=income*0.03f; 30%
//             System.out.println("Tax on ur income will be : "+tax);
//    }


//      }
//     }
// }

// TERANARY OPERATORS >>         its not somehting which is frequently used its another way of writig if else
    // condition ? expression_if_true : expression_if_false;

// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         int num;
        
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the num:" );
//         num=sc.nextInt();
//         String result=((num % 2)==0) ? "even":"odd";
//         System.out.println("Result is "+result);

//      }
//     }


//////////////////////////////
//                                                      SWITCHES >>>>>

// how it works

// Java evaluates the expression.

// It compares it with each case value.

// When a match is found → that block runs.

// break stops execution from continuing to other cases.

// public class Main {
//     public static void main(String[] args) {

//         int day = 3;

//         switch(day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;

//             case 2:
//                 System.out.println("Tuesday");
//                 break;

//             case 3:
//                 System.out.println("Wednesday");
//                 break;

//             default:
//                 System.out.println("Invalid day");
//         }
//     }
// }  o/p : wednesday


// PRACTISE QUIS :
import java.util.*;

class Main {
    public static void main(String[] args) {
        int num;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num:" );
        num=sc.nextInt();
       if(num>0){
           System.out.println("positive");
       }
       else{
           System.out.println("negative");
       }

     }
    }
//negative positive


