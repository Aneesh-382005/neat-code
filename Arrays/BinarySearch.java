package Arrays;

import java.util.Scanner;

class BinarySearch
{

    static int BinarySearchMethod(int Array[], int First, int Last, int x) {
        int result = -1;
        if (First < Last) {
            int mid = (First + Last) / 2;
            if (Array[mid] == x)
                result = mid; 
            else if (Array[mid] > x)
                result = BinarySearchMethod(Array, First, mid - 1, x); 
            else
                result = BinarySearchMethod(Array, mid + 1, Last, x);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = jk.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of a sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = jk.nextInt();
        }
        System.out.println("Enter the number to search:");
        int x = jk.nextInt();
        int first = 0, last = n - 1;
        int result = BinarySearchMethod(arr, first, last, x);
        if (result == -1) {
            System.err.println("Element not Found"); 
        }else {
            System.out.println("Element Found at index " + result);
        }
        jk.close();
    }
}
