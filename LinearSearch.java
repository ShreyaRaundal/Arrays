public class LinearSearch {
    public static int linearsearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={10,202,30,40};
        int target=30;
        int result=linearsearch(arr, target);
        if(result!=-1){
            System.out.println("The is found at index : "+result);
        }
        else{
            System.out.println("The is not found");
        }
    }
    
}
