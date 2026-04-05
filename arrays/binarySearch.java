package arrays;

public class binarySearch {

    public static int search(int arr[],int key){
        int left=0;
        int right=(arr.length)-1;
        int mid;
       while(left<=right){

            mid=(left+right)/2;


            if(key==arr[mid]){              // we are comapring values right so key==arr[mid ] chahiye >>
                return mid;

            }
            else if(key>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
       }
       return -1;

    }
    public static void main(String args[]){
        int arr[]={12,15,66,88,94,123};
        int key=12;

        int result = search(arr,key);

        System.out.println("The key is at position " + result);


    }
}
