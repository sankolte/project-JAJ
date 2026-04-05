package arrays;

public class reversersal {

    public static void reverse(int arr[]){

        int left=0;
        int right=(arr.length)-1;
        int temp;

        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;


        }

        

    }
    public static void main(String[] args) {
        int arr[]={23,44,12,3,4,5,6};
        reverse(arr);

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);

       }

    }
}
