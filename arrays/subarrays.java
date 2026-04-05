package arrays;

public class subarrays {


    public static void printsubarrays(int arr[]){
        int count=0;
        // int sum=0;  not here coz every subarrays should have its own sum so it should be reset for each >>it should be on second loop basically as soon as ekk naya subbarray bana like start and end uska clear hua we will set the sum of it to zero>>

        for(int i=0;i<arr.length;i++){
            int start = i;                 //here we are dealig with index and not values in that indexes like staring position find karni h eand not starting position ki value>>
            for(int j=i;j<arr.length;j++){     //actaully there j=i+1 should be  j=i coz wo single arrys bhi to print karan he na >>
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.println(arr[k]);
                    sum=sum+arr[k];
                    
                }
                System.out.println();
                count++;
                System.out.println("sum is "+sum);
            }
             

        }
        System.out.println("Total number of subarrays " + count);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        printsubarrays(arr);
        
    }
}
