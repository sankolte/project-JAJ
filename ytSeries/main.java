package ytSeries;

import java.util.Scanner;

// public class functions {
//     public static void main(String[] args) {
//         // sum(); ha bhai aise calling nahi chalegi coz methhos static nahi he >> toh have to make method static orrrrr do it proeprly like alag class bano of sum in which method dalo > and then psvm me uska instance banao i.e obj banao and usko acces karo >>
//         methods obj = new methods();
//         obj.sumnumber();
//         obj.greeting("sanskar");
//         multiplication( 2,3);


//     }
//     static int multiplication(int a, int b){
//         int product = a*b;
//         return product;
        
//     }
// }


//   class methods {
//         Scanner sc = new Scanner(System.in);
//         void sumnumber(){
//         System.out.println("enter first num");
//         int a = sc.nextInt();
//         System.out.println("Enter second number");
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("sum is "+sum);
//     }

//     String greeting(String name){          // see now >> agar datatype lagaye ho mehtod ko toh abhi jo return karna padega >> anad wo bhi string hi hona chahiye>>>
       
//          String a= name;
//          System.out.println("hello"+name);
//          return a;
//     }

// } 

//---------------------------------------------------------------------------------------
// imp concept >>> HOW ARE THE VALUES ACTUALLY PASSED like >> 

public class main{
    public static void main(String[] args) {
        swap(2,3);
        String name ="sahil";
        changeName(name);

    }
    static void swap(int a ,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(b);
}

    static void changeName(String name){
        name="sanskar";

    }
}

// o/p : this will not work >> swapping nahi hogi 

// bit confusong right 
// .. ok so 

/*
    public static void main(...){
    
        String name = "tony bhaiya";
        greet(name);
    
    }

    static void greet(String naam){
    sout(naam);
    };

    o/p: tony bhaiya

this wll work fine as fuck >> yeah 

even greet method me parameter jp pass kar rahe wo "naam" he and jo hum upper pvsm me le rahe he wo 'name' he but still 
internally naam will conatin "tony bhaiya" value in it 

ye kya backchodi he >

public class Main {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


    public static void main(String[] args) {
        int x = 10;
        int y = 20;


        swap(x, y);


        System.out.println(x); // 10
        System.out.println(y); // 20
    }
}

You might expect:

x = 20
y = 10

but you get:

x = 10
y = 20
Why?

When you call:

swap(x, y);

Java copies the values of x and y into a and b.

Think of it like:

main():


x = 10 ──copy──> a = 10
y = 20 ──copy──> b = 20

Then inside swap():

int temp = a;  // temp = 10
a = b;         // a = 20
b = temp;      // b = 10

You successfully swapped a and b, but those are only copies.

main()              swap()


x = 10              a = 20
y = 20              b = 10
                     ↑
                  swapped!

When the method finishes, a and b disappear. x and y are unchanged.

"But objects can be changed through methods, right?"

Yes, and this is where it gets confusing.

Java is always pass-by-value. For objects, the value being copied is the reference.

For example:

class Person {
    int age;
}


static void change(Person p) {
    p.age = 30;
}

If you do:

Person person = new Person();
person.age = 20;


change(person);


System.out.println(person.age);

You get:

30

because both the original reference and the copied reference point to the same object.

The key idea
Primitive:


x = 10
   ↓ copy
a = 10


Changing a does NOT change x
Object:


person ───────→ [ Person object ]
                  ↑
                  │
p ────────────────┘


Changing the object through p DOES affect the same object

So a normal Java method cannot swap two primitive variables in the caller just by receiving them as int a, int b.




/////////////////////////////
int x = 10;
int y = 20;


swap(x, y);

And:

static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}
Step 1: Before calling swap

You have:

x = 10
y = 20
Step 2: Call the method
swap(x, y);

Java makes copies:

x = 10        y = 20
 ↓             ↓
copy          copy
 ↓             ↓
a = 10        b = 20

Now there are 4 variables:

MAIN              SWAP


x = 10            a = 10
y = 20            b = 20

x is NOT a.

y is NOT b.

They just happen to have the same values initially.

Step 3: Swap a and b

Inside the method:

int temp = a;  // temp = 10
a = b;         // a = 20
b = temp;      // b = 10

Now:

MAIN              SWAP


x = 10            a = 20
y = 20            b = 10

You DID swap the numbers!

But you swapped a and b, not x and y.

Step 4: Method finishes

When swap() finishes, its variables disappear:

a = 20  ❌ gone
b = 10  ❌ gone
temp   ❌ gone

The original variables are still:

x = 10
y = 20

That's why you don't see the swap.

Think of it like this 🧠

Imagine I have two boxes:

Your boxes:


x → [10]
y → [20]

I make two new boxes and copy the numbers:

Your boxes:       My boxes:


x → [10]          a → [10]
y → [20]          b → [20]

I swap my boxes:

Your boxes:       My boxes:


x → [10]          a → [20]
y → [20]          b → [10]

Then I throw my boxes away.

Your boxes were never touched.

That's exactly what happens with int in Java.

The one sentence to remember

When you pass a primitive to a Java method, Java gives the method a copy of the value, not the original variable.

That's why swap(int a, int b) cannot directly swap x and y



*/

// wo primitives ko and objectd ka thoda hosab alag hota he na >>

// primitives me >>> pas by value buss khatam
// obj me >> pass by the copy of the values of the ref vaibales ( thats why reffers to a same object >> )


// and here in seocnd >> if ekk bhi variable ka value chnage hua ( basically update hua) > toh wo dusre ka bhi update hoga ( coz pointing or refering towreds the same obj)

//eg<
/*

pvsm(){
int[] arr= {1,3,5,77,4,3};
change(arr);    --> ekk function call kar rah hu 
}

static void change(int[] nums){
    nums[0]=99;

}
now see     arr--->[1,3,5,77,4,3]<----nums     basically nums is toh copy if the value of the arr ok >>

both ref varibale refering to same array obj 
now if nums[0]=99;
chnage ho jaye >> if chnage occures in nums then arr me bhi chnage coz >> end of the day >> donon ekk hi he 
   matlab if one array obj is modified then >> second array obj is also modifeid >>''

   




*/

// ----------------------------------------------------------------------

//   SCOPE >>>

/*

firslty let me understand gandmsati ho swap


public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

public static void main(String[] args) {

    int x = 10;
    int y = 20;

    swap(x, y);

    System.out.println(x);
    System.out.println(y);
}

here we are expecting ki swap ho jaye >>> but hota nhi he 

initially 
main()

x = 10
y = 20

then swap(x,y)

so as we know ki copy banta he 

swap()

a = 10   ← copy of x
b = 20   ← copy of y

now wo swap hoga exicute 
and now 
a=20
b=10
but these are the chnages in copy right >>> like jo main the x and y unki copy he a and b right abhi unme hue he changes

here wo hoga call by value se ( yes these are premetives ) here dono x,y , a ,b ye sab are not refreing to same obj coz they are premitive

cut to agar kuch dusra hota other than premitives then >>> ye possible hota >> like dono variables would poibt towards same obje coz here copy banti >> 


*/

//----------------    ata yeu de SCOPE 


