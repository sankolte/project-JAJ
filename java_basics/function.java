// reusable block od code >>
import java.util.*;

public class function {
    public static int sum(int a,int b){
        int sum =a+b;
         System.out.println("Sum is " + sum);
        return a+b;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("Enter a");
       int a=sc.nextInt();
        System.out.println("Enter b");
       int b =sc.nextInt();
        
        sum(a,b);

    }
}
// normally this is the  schema for my code>> see jab main method me call karenege  dunction ko then sum(a,b) toh it should know what is a and b toh basically muzhe input bhi udhar hi lena padega in main func 
// so that wo calling me that sum knows what is a,b

// what we can do is 
// int sum =a+b;
// return sum;
// ye bhi sahi he 
/////////////////////////////////////////////////////////////
/// factorial ??>>>
// import java.util.*;
class Main {
    public static int factorial(int n){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
         n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
     factorial(5);
     
    }
}

//or 
// import java.util.*;

class m {
     public static int factorial(int n){
        int fact=1;
       
        for(int i=1;i<=n;i++){
            fact=fact*i;
        
        }
        System.out.println("factorial is "+fact);
        return fact;
        
        
     }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber");
        int n =sc.nextInt();
        factorial(n);
    }
}


/////////////////////////////////////////////////////////
// prime num code

// this is classic code like this formsat id common >>

//import java.util.*;

class ma {
    public static boolean isPrime(int n ){
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if((n%i)==0){
                    isprime=false;
                    
                      break;
                }
                else {
                     isprime=true;
                }
              
                
                }
               if(isprime){
                   System.out.println("prime num");
               }
               else {
                   System.out.println("not prime");
               }
                return isprime;
                
            }

            public static void range(int n){
                for(int i=2;i<=n;i++){
                    if((isPrime(i))==true){
                        System.out.println(i);                //for range >>>
                    }
                    
                }
            }
            
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        isPrime(n);
        
    }
    }
    

    ////////////////////////////////////////////////////////////////////////////////////
    // BINARY TO DECIMAL CONVERSION >>

   // import java.util.*;

public class function_basics{
  public static void bintodec(int n){
    int dec=0;
   int pow=0;
   
    while(n>0){
      int  lastdigit=n%10;
      dec=dec+(lastdigit*(int)Math.pow(2,pow));
      pow++;
      
    }
    System.out.println(dec);
  }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enetr a binary number");
     int n = sc.nextInt();
     bintodec(n);
     
    }
}