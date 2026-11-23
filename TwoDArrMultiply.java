public class TwoDArrMultiply
{
    public int[][] twoDMultiply(int matrixA[][], int matrixB[][])
    {
        int result[][] = new int[matrixA.length][matrixB[0].length];

        for(int i = 0; i < matrixA.length; i++)
        {
            for(int j = 0; j < matrixB[0].length; j++)
            {
                for(int k = 0; k < matrixB.length; k++)
                {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        TwoDArrMultiply obj = new TwoDArrMultiply();

        int A[][] = {{3,5,9},{7,6,2},{4,8,1}};

        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};

        int data[][] = obj.twoDMultiply(A, B);

        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                System.out.print(data[row][col] + "  ");
            }
            System.out.println();
        }
    }
}