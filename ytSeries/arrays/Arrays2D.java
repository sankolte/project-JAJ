
package ytSeries.arrays;
import java.util.Scanner;

public class Arrays2D {

    public static void main(String[] args) {
        // 2d array is simply a matrix kinda thing > 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows and cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][]arr=new int[rows][cols];

        for(int i=0 ;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("The 2d array inputed is :");

         for(int i=0 ;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(arr[i][j]+"");
            }
            System.out.println();  // bascially matrix form me chahiye na > so thats why -> toh after each and every row ekk line 
        }

    }
    
}

/*

int[][]arr=[{1,2,3},     index 0
            {5,6,7},     index 1
            {4,2,3,4}     index 2
            ];

    sout(arr[2])  o/p : {4,2,3,4}

    sout(arr[2][1])  o/p : 2
        

    yeps>>>>>>>>>>>>>>>>

    also one more thing :
    sout(arr.length);   this will print number of rows 

    ...........................

    how kunal told to input :

    int[][]arr=int[3][2];

    for(int rows=0 ; rows<arr.length ; rows++){
        for(int cols=0 ; cols<arr[rows].length ; cols++){         ;;;; bascially see cols ko kaise ? : see wo bade array jo he "arr" uske her ekk index pe jo obj he {x,x,x} uska lenght find karna hoga rihgt toh simpy cols<arr[row].length kar diya : toh mast se wo exact pakdo arr ko 

            arr[rows][cols]=sc.nextInt();
        }
    
    }

      /////////////////// and for printing the array 

     import java.util.Arrays;

      for(rows 0 to rows<arr.length){
      
        sout(Arrays.tostring(array_ka_naam)[row]);
      }

 

*/