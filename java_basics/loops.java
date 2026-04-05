// public class loops {
//      public static void main(String args[]){
//         int num=1;
//         while(num<=10){   while hua to yaha pe aisa cond check karni ki basically >> idha rtrue ana chahiye print karane ke liye and jab false ayeg tab exicution will stop
//             System.out.println(num);
//             num++;
//         }
//      }
// }



// import java.util.*;
// public class loops {
//      public static void main(String args[]){
//         int num=1;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter num of itteration");
//         int n = sc.nextInt();


//         while(num<=n){
//             System.out.println(num);
//             num++;
//         }
//      }
// }


//sum of first n natural num


// import java.util.*;
// public class loops {
//      public static void main(String args[]){
//         int num=0;
//         int sum=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("natural num : ");
//         int n = sc.nextInt();


//         while(num<=n){
//             sum=sum+num;
//             num++;
//         }
//         System.out.println("Sum of n natural num is "+sum);

//      }

// }


//reversing the given number      234->432      last_digit=num % 10;   and then print that num then -->> abhi wo last num gayab kaise kare like it eill be now 4234  to num/10 ye last wale ko nikal deta he >>>only these 2 things

//  import java.util.*;

//  public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enetr a num");
//         int num=sc.nextInt();
//         //no for loop here coz yaha itterations pata nahu he 
//         while(num>0){
//             int last_digit=num %10;
//             System.out.print(last_digit);

//             num=num/10;

//         }
//     }
//  }

//DO WHILE LOOP
// This loop always runs once, even if the condition is false.
// int i = 1;

// do {
//     System.out.println(i);
//     i++;
// } while(i <= 5);

// WE USE SPECIAL TWO KEYWORDS break; AND continue;
//  for(int i=1;i<=5;i++){
//     if(i==3){
//         break;
//     }
//         print("hello");
    
    
//  } // 3rd intration pe he loop will be terminated >> sirf tiin bar hello print hoyga 


//  for(int i=1;i<=5;i++){
//     if(i==3){
//         continue;   //its kind of a speed breaker behaviour >>    skips the itteration 
//     }
//         print("hello");
    
    
//  }   // 3rd itteration ko skip karke age 4th pe flow of cide transfer karega 
 
 // user keep entering number until multile of 10 is enterd then the loop should be terminated

 import java.util.*;

class loops {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       int i=1;
        while(i>0){
             System.out.println("enter number");
               i = sc.nextInt();
            if((i % 10)==0){
                break;
            }
            System.out.println("The number is.." + i);
        }
        System.out.println("Loop terminated coz number is multiple of 10");
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do{
            System.out.println("enter number");
               i = sc.nextInt();
               if((i%10)==0){
                break;
               }
               System.out.println("The number is.." + i);
        }while(i>0);

        System.out.println("Loop terminated coz number is multiple of 10");

    }
}
//two variations >>

//////////////////////////  CHECK WHETHER PRIME NUM OR NOT

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// import java.util.*;

class prime{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime=true;  //assumig that num is prime
        
        //agar number liya 5 toh shuru 2 se karo 2 se 4 tak coz we are checkning for modulp and obvio ekk num ka 1 se and uss num khud se modulo 0 hi ayega 
        for(int i=2;i<n-1;i++){   //for optimiztaion >> as we know i<Math.sqrt(n);   basically root of n coz humne logic padhahe 
            if((n%i)==0){
                isprime=false;
        }
        

    }
    if(isprime){
            System.out.println("This is a prime num");
            }
            else{
                System.out.println("This is not a prime num");  //coz sirf 2 divisor hote he prime num ke 1 and wo num khud jo ki dod humne liye hi nahi he shuru hi 2 se kiya he and khatam n-1 pe kiya he 
            }
        }
} 


/////////////////////////////////////////////////////////////////////
//                      PATTERNS>>
class pattern1 {
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){             //basicaly star utne hi chhaihye jitna line number ho dusre line pe 2 hi star chahiye > star<=line 
                System.out.print("*");
            }
            System.out.println();                  // most impoertnat > after pinting each line like suppose first line 1 star print kiya > toh uske baad go to next line >>

        }
    }
}
// *
// **
// ***               
// ****

// -------------------------------------------------------   

class pattern2 {
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int star=4;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// ****
// ***
// **
// *

//--------------------------------------------------------------

class patter3 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){                        
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
// 1
// 12
// 123
// 1234
//here is the code i jahve written but the thinng is i m nt understanfong one thing at next line how previous 
// number is printed like 1 12 so here i know how 2 is printed but how that 1
// probably u havethis doubt > but understand 
// tya baherchya loop mule to atla loop pratek vela 1 pasun chalu hoto mhnaje each and every time when inner loop terminated then the puter loop is incremented by 1 and then 
// the whole inner loop run agin >> ya easy 
// outer loop ka first itteration > inner loop runs once
// outer 2nd itteratio  > inner loops runs 2 times (pura pehele se)
// outer 3rd itteratpm > inner runs 3 times (pehele se )
//continue>>





class pattern4 {
    public static void main(String[] args) {
        char ch='a';
        
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;                          ///her bar ch ki value badha dega matlab now ch a tha right wo b banega abhi loop ke bahar nikal kr ch me b pass hoyga easy>>
                
            }
            System.out.println();
        }
    }
}
// a
// bc
// def
// ghij
