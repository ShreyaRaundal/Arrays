import java.util.*;

public class LongestSubarrayWithSumK {
    public static int longextSubarray(int []arr,int k){
        Map<Integer,Integer>prefixMap=new HashMap<>();

        int sum=0,maxLen=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];


            if(sum==k){
                maxLen=i+1;
            }
    
            if(prefixMap.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-prefixMap.get(sum-k));
            }
    
            if(!prefixMap.containsKey(sum)){
                prefixMap.put(sum,i);
            }
        }
        return maxLen;  
    }
    public static void main(String[] args){
        int[] arr={1,2,3,-2,4,5};
        int k=5;
        System.out.println("Longest subarray length with sum "+k+":"+longextSubarray(arr, k));
    }
}
