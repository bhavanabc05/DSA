package Sorting;

public class selectionSort {
    public static void ss(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String[] args) {
        int arr[]={3,4,1,5,2,9,8,7};
        ss(arr);
        for(int n:arr){
            System.out.print(n);
        }
    }
}
