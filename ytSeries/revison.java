package ytSeries;

public class revison {
    public static void main(String[] args) {
        sum(2,3);  // see here static nahi toh dierrct kar liya 

        //now wo dusra metid mul wala > uska >> pehele class ka obj banao and then obj se method find karo>
        revison obj = new revison();
        obj.mul(2, 6); // like this 

        vegla v = new vegla();
        v.divide(6,3);
    }

    // ekk method ki he declre where STATIC which means it belings to the belcong to class ( no need of obj se call karne ke )
    public static int sum(int a , int b){
        return a+b;
    }

    public int mul(int a , int b){
        return a*b;

    }
}
// abbhi ekk naya clas banay alag > agar iske ander ke methods ko bulana he tog  firstly iska obj banao and then acees
 class vegla {

     int divide(int a , int b){
        return a/b;
    }
    
}


