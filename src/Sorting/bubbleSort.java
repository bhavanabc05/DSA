package Sorting;

public class bubbleSort {
    public static void bs(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={3,4,1,5,2};
        bs(arr);
        for(int n:arr){
            System.out.print(n);
        }

    }
}
