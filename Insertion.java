import java.util.Arrays;

public class Insertion {
    public static int[] insertAtIndex(int[] arr, int index, int value){
        int[] newArr = new int[arr.length + 1];
        for(int i=0,j=0;i<newArr.length;i++){
            if(i==index){
                newArr[i]=value;
            }
            else{
                newArr[i]=arr[j++];
            }

        }
        return newArr;   
    }
    public static void main(String[] args){
        int arr[]={10,29,30,40,50};
        int index=2;
        int value=55;
        int[]newArray=insertAtIndex(arr, index, value);
        System.out.println("Updated Value"+ Arrays.toString(newArray));
    }
}
