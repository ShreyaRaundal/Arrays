import java.util.*;
public class SubarrayWithZeroSum {
    public static boolean hasZeroSumSubarray(int[] arr) {
        Set<Integer>prefixSet=new HashSet<>();
        int sum=0;
        for(int num:arr){
            sum+=num;
            if(sum==0 || prefixSet.contains(sum)){
                return true;
            }
            prefixSet.add(sum);
        }
         return false; 
    }
    public static void main(String[] args) {
        int [] arr={4,2,-3,1,6};
        System.out.println("Hs subarray with zero sum :"+hasZeroSumSubarray(arr));   
    }
    
}
