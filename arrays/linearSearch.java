package arrays;


// public class linkedlist {
//     public static void main(String args[]){
//         int arr[]={11,56,76,88,34,55};
//         int key=8;
//        boolean res =true;
//         for(int i=0;i<arr.length;i++){
//             if(key==arr[i]){
//               res=true;
//                 System.out.println("Key is found at position "+i );
//             }
//            else{
//             res=false;          //u cant reset it everytine >>wrong 
//            }
//         }
         
//                 if(res==false)
//           {      System.out.println("Key is not found ");
// }        
//     }
// }


public class linearSearch{

    public static int linSea(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if (arr[i]==key){
               return i;
            }
           
        }
        return -1;

        }
         public static void main(String args[]){
        int arr[]={11,44,55,334,7,77};
        int key=7;
       int result =linSea(arr,key);

       if (result==-1){
        System.out.println("Key not found");
       }
       else{
        System.out.println("Key found at " + result);
       }
    }
    }
   
