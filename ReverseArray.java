public class ReverseArray {
    public static void main(String[] args){
        int arr[]={10,30,40,60,20};
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i:arr){
            System.out.println(i +" ");
        }
    }
    
}
