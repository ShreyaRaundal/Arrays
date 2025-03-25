import java.util.Scanner;
import java.util.Arrays;

class Deletion {
    public static int[] DeleteOfIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {  
            System.out.println("Invalid Input");
            return arr;
        }

        int[] newArr = new int[arr.length - 1]; 
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];  `
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the index to delete:");
        int index = sc.nextInt();

        int[] newArr = DeleteOfIndex(arr, index);
        System.out.println("Array after deletion: " + Arrays.toString(newArr));  
        
        sc.close();  // 
    }
}
