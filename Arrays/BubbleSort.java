package Arrays;

import java.util.Scanner;

class BubbleSort
{

    static void BubbleSortMethod(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner jk = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = jk.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = jk.nextInt();
        }

        BubbleSortMethod(arr);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        jk.close();
    }
}
