/*
1)	Develop a Menu driven program to demonstrate the following operations of Arrays
——MENU——
1. CREATE
2. DISPLAY
3. INSERT
4. DELETE
5. SEARCH
6. EXIT
*/
package Arrays;
import java.util.Scanner;

class Operations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, ch, i, pos, ele, flag = 0;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        