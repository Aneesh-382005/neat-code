
package Arrays;
import java.util.Scanner;

class Operations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int[] arr = null;
        int size = 0;
        do
        {
            System.out.println("——MENU——");
            System.out.println("1. CREATE");
            System.out.println("2. DISPLAY");
            System.out.println("3. INSERT");
            System.out.println("4. DELETE");
            System.out.println("5. SEARCH");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    size = sc.nextInt();
                    arr = new int[size];
                    System.out.println("Array created successfully!");
                    break;
                case 2:
                    if(arr == null)
                    {
                        System.out.println("Array is not created yet!");
                    }
                    else
                    {
                        System.out.println("Array elements are:");
                        for(int i = 0; i < size; i++)
                        {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if(arr == null)
                    {
                        System.out.println("Array is not created yet!");
                    }
                    else
                    {
                        System.out.print("Enter the index where you want to insert the element: ");
                        int index = sc.nextInt();
                        if(index < 0 || index >= size)
                        {
                            System.out.println("Invalid index!");
                        }
                        else
                        {
                            System.out.print("Enter the element you want to insert: ");
                            int element = sc.nextInt();
                            for(int i = size - 1; i > index; i--)
                            {
                                arr[i] = arr[i - 1];
                            }
                            arr[index] = element;
                            size++;
                            System.out.println("Element inserted successfully!");
                        }
                    }
                    break;
                case 4:
                    if(arr == null)
                    {
                        System.out.println("Array is not created yet!");
                    }
                    else
                    {
                        System.out.print("Enter the index where you want to delete the element: ");
                        int index = sc.nextInt();
                        if(index < 0 || index >= size)
                        {
                            System.out.println("Invalid index!");
                        }
                        else
                        {
                            for(int i = index; i < size - 1; i++)
                            {
                                arr[i] = arr[i + 1];
                            }
                            size--;
                        }
                    }
                    break;
                case 5:
                    if(arr == null)
                    {
                        System.out.println("Array is not created yet!");
                    }
                    else
                    {
                        System.out.print("Enter the element you want to search: ");
                        int element = sc.nextInt();
                        boolean found = false;
                        for(int i = 0; i < size; i++)
                        {
                            if(arr[i] == element)
                            {
                                System.out.println("Element found at index " + i);
                                found = true;
                                break;
                            }
                        }
                        if(!found)
                        {
                            System.out.println("Element not found!");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 6);
        sc.close();
    }
}
