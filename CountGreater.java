public class CountGreater {
    public static int countGreater(int[]arr,int X){
        int count=0;
        for(int num:arr){
            if(num>X)count++;  
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,44,56,25,58};
        int X=25;
        System.out.println("Element Gearter than "+X+":"+countGreater(arr, X));
    }
}
