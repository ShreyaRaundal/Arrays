public class SecondSmallestAndLargestNo {
    public static void main(String[] args){
        int arr[]={10,20,40,60,30,99,23};
        int firstLargest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
        int firstSmallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE;

        for(int num:arr){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }else if(num > secondLargest && num != firstLargest){
                secondLargest=num;
            }

            if(num<firstSmallest){
               secondSmallest= firstSmallest;
                firstSmallest=num;
            }else if(num<secondSmallest && num!=firstSmallest){
                secondSmallest=num;
            }
        }
        System.out.println("Second Largest :"+secondLargest);
        System.out.println("Second Smallest : "+secondSmallest);
    }
}
