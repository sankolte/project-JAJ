package arrays;

public class pairs {


    public static void pairing(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr= arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+curr +"," +arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={12,33,55,3,7,55,6};
        pairing(arr);
    }
}
