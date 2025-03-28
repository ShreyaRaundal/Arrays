public class KandaneAlgorithm {
    static int maxSubarraySum(int[] arr) {
        int res=arr[0];
        int maxEnding=arr[0];

        for(int i=1;i<arr.length;i++){

            maxEnding=Math.max(maxEnding + arr[i], arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;

    }
    public static void main(String[] args){
        int arr[]={2,4,-6,2,1};
        System.out.println(maxSubarraySum(arr));
    }
}
