import java.util.Arrays;

public class SelectionSort {
    public static void selectionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j; 
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;


        }
    }
    public static void main(String[] args){
        int arr[]={98,54,30,40,50,62};
        selectionsort(arr);
        System.out.println("Sort array : "+Arrays.toString(arr));
    }
}
