package ytSeries;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class conditionalsandloops {
    public static void main(String[] args) {
        int salary=2000;
        if(salary>1000){
            salary=salary+2000;
        } else if (salary>1500){
            salary=salary+5000;
        }else{
            salary=salary+10000;
        }
        System.out.println("The final salary is "+salary);
    }
}


// loops >>

for(int i=0;i<=10;i++){
    System.out.println(i);
}

// while loops
int num =1;
while(num<=5){
    System.out.println(num);
    num++;
}
// u nned while loop > when u dont know how many times the loop os gonna run like jab itterations pata nahi ho tab while loop


// do while loop

int n=1;  // here also like intiliaztion upper he kar dene ka
do{
    System.out.println(n);
    n++;
}while(n<=10);

// here bascially kuch bhi kar lo ekk bar to bhi hog ahi run like "1" print hoga hi and wo increment bhi hoga like it will exicute atleast once 

// larfest of the 3 numbers 

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a>b){
    System.out.println("a is the greaest");
    
} else if(b>c){
    System.out.println("b is the greatest");
}else{
    System.out.println("c is the greatest ");
}
// idhar sout for enetering numbers can be alsp used >>'

//or

int max =a;  //assuming 
if(b>max){
    max=b;
}
if(c>max){
    max=c;
}
System.out.println(max);


int maxNumber = Math.max(c,Math.max(a,b));
// this will simply give us largest >>

