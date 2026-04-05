package arrays_2;

public class kadane {

    public static void maxsubarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        System.out.println("The max subarray is " + maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxsubarray(arr);
    }
}
//crazy ass optimised>>>


//though there is one corner case
