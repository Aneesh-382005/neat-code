package Arrays;

public class MatrixOperations
{
    public static void Reverse(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[][] MatrixMultiplication(int[][] arr1, int[][] arr2)
    {
        int row1 = arr1.length;
        int row2 = arr2.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;
        if(col1 != row2)
        {
            System.out.println("Matrix multiplication is not possible!");
            return null;
        }

        int[][] result = new int[row1][col2];
        for(int i = 0; i < row1; i++)
        {
            for(int j = 0; j< col2; j++)
            {
                for(int k = 0; k< col1; k++)
                {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] Transpose(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        int[][] result = new int[col][row];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }
}
