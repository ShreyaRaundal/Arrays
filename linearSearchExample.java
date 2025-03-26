public class linearSearchExample {
    public static void main(String[] args){
        int arr[]={10,20,40,50,60,77};
        int target=50;
        
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element is found : "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element is not found");
        }
    }
}
