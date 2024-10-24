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
                    Create(arr, size);
                    break;
                case 2:
                    Display(arr, size);
                    break;
                case 3:
                    Insert(arr, size);
                    break;
                case 4:
                    Delete(arr, size);
                    break;
                case 5:
                    Search(arr, size);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 6);
        sc.close();
    }

    public static void Create(int[] arr, int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array created successfully!");
        sc.close();
    }

    public static void Display(int[] arr, int size)
    {
        if(size == 0)
        {
            System.out.println("Array is empty!");
            return;
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Insert(int[] arr, int size)
    {
        if(size == 0)
        {
            System.out.println("Array is empty!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        int ele = sc.nextInt();
        System.out.print("Enter the position to insert: ");
        int pos = sc.nextInt();
        if(pos < 0 || pos > size)
        {
            System.out.println("Invalid position!");
            sc.close();
            return;
        }
        int[] temp = new int[size + 1];
        for(int i = 0; i < pos; i++)
        {
            temp[i] = arr[i];
        }
        temp[pos] = ele;
        for(int i = pos; i < size; i++)
        {
            temp[i + 1] = arr[i];
        }
        arr = temp;
        size++;
        System.out.println("Element inserted successfully!");
        sc.close();
    }

    public static void Delete(int[] arr, int size)
    {
        if(size == 0)
        {
            System.out.println("Array is empty!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position to delete: ");
        int pos = sc.nextInt();
        if(pos < 0 || pos >= size)
        {
            System.out.println("Invalid position!");
            sc.close();
            return;
        }
        int[] temp = new int[size - 1];
        for(int i = 0; i < pos; i++)
        {
            temp[i] = arr[i];
        }
        for(int i = pos + 1; i < size; i++)
        {
            temp[i - 1] = arr[i];
        }
        arr = temp;
        size--;
        System.out.println("Element deleted successfully!");
        sc.close();
    }

    public static void Search(int[] arr, int size)
    {
        if(size == 0)
        {
            System.out.println("Array is empty!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == ele)
            {
                System.out.println("Element found at position " + i);
                sc.close();
                return;
            }
        }
        System.out.println("Element not found!");
        sc.close();
    }
}
