package ytSeries;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        // sum(); ha bhai aise calling nahi chalegi coz methhos static nahi he >> toh have to make method static orrrrr do it proeprly like alag class bano of sum in which method dalo > and then psvm me uska instance banao i.e obj banao and usko acces karo >>
        methods obj = new methods();
        obj.sumnumber();
        obj.greeting("sanskar");
        multiplication( 2,3);


    }
    static int multiplication(int a, int b){
        int product = a*b;
        return product;
        
    }
}


  class methods {
        Scanner sc = new Scanner(System.in);
        void sumnumber(){
        System.out.println("enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is "+sum);
    }

    String greeting(String name){          // see now >> agar datatype lagaye ho mehtod ko toh abhi jo return karna padega >> anad wo bhi string hi hona chahiye>>>
       
         String a= name;
         System.out.println("hello"+name);
         return a;
    }

} 
