package Arrays;

import java.util.Scanner;

class LinearSearch {

    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = jk.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = jk.nextInt();
        }
        System.out.println("Enter the number to search:");
        int x = jk.nextInt();
        int i;
        int flag = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element Found at index: " + i);
        }
        jk.close();
    }
}
