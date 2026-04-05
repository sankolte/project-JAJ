package arrays_2;

public class maxarraysum {

        public static void sum(int arr[]){

            int maxsum=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){
                int start=i;

                for(int j=i;j<arr.length;j++){
                    int end=j;
                    int currentsum=0;


                    for(int k=start;k<=end;k++){
                        currentsum=currentsum+arr[k];

                    }

                    System.out.println(currentsum);  //i want to just see  all sums first 
                    System.out.println();

                    if(maxsum<currentsum){
                        maxsum=currentsum;
                    }
                }
            }


            System.out.println("The maxsum is " + maxsum);

        }
 


       public static void main(String[] args) {
        int arr[]={2,-5,-4,8,7};
        sum(arr);
       }
}
