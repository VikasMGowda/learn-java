public class TwoDimensional
{
//add matrix
    /*public static void main(String[] args)
    {

        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int[][] B = {{1, 0, 0},{0, 1, 0},{0, 0, 1}};

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[i].length; j++)
                {

                result[i][j] = A[i][j] + B[i][j];

            }
        }

        for (int i = 0; i < result.length; i++)
            {
            for (int j = 0; j < result[i].length; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
} */


//using for each loop
/*for(int[] row : B)
    {
        for(int col : row)
        {
            System.out.print(col+ " ");
        }
        System.out.println();
    }
}
}*/

//matrix multiplication
public static void main(String[] args)
    {

        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int[][] B = {{1, 0, 0},{0, 1, 0},{0, 0, 1}};

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[i].length; j++)
                {

                result[i][j] = A[i][j] * B[i][j];

            }
        }

        for (int i = 0; i < result.length; i++)
            {
            for (int j = 0; j < result[i].length; j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}