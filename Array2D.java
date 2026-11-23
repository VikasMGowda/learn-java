public class Array2D
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {30, 50, 9},
            {7, 6, 2},
            {40, 8, 10}
        };

        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8, 9},
            {1, 2, 3}
        };

        System.out.println("Matrix Addition");
        printMatrix(matrixAddition(A, B));

        System.out.println("Scalar Multiplication");
        printMatrix(scalarMultiplication(arr, 2));

        System.out.println("Count Rows Sum Greater Than 50");
        System.out.println(countRowsGreaterThan50(arr));

        System.out.println("Maximum in Every Row");
        findMaximumInEveryRow(arr);

        System.out.println("Minimum in Every Row");
        findMinimumInEveryRow(arr);

        System.out.println("Minimum Even in Every Row");
        findMinimumEven(arr);

        System.out.println(" Maximum Odd in Every Row");
        findMaximumOdd(arr);

        System.out.println("Multiply Main diagonal by 10 ");
        printMatrix(mainDiagonal(arr));


        System.out.println(" Sum of Maximum Elements");
        System.out.println(sumOfMaximumElements(arr));
    }


    // 1. Matrix Addition

    static int[][] matrixAddition(int[][] A, int[][] B)
    {
        int[][] result = new int[A.length][A[0].length];

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }


    // 2. Scalar Multiplication

    static int[][] scalarMultiplication(int[][] arr, int scalar)
    {
        int[][] result = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                result[i][j] = arr[i][j] * scalar;
            }
        }

        return result;
    }


    // 3. Count Rows Whose Sum Is Greater Than 50

    static int countRowsGreaterThan50(int[][] arr)
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            for(int j = 0; j < arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }

            if(sum > 50)
            {
                count++;
            }
        }

        return count;
    }


    // 4. Find Maximum in Every Row

    static void findMaximumInEveryRow(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int max = arr[i][0];

            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }

            System.out.println(max);
        }
    }


    // 5. Find Minimum in Every Row

    static void findMinimumInEveryRow(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int min = arr[i][0];

            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }

            System.out.println(min);
        }
    }


    // 6. Find Minimum Even in Every Row

    static void findMinimumEven(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int min = Integer.MAX_VALUE;

            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] % 2 == 0 && arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }

            if(min == Integer.MAX_VALUE)
            {
                System.out.println("No even number");
            }
            else
            {
                System.out.println(min);
            }
        }
    }


    // 7. Find Maximum Odd in Every Row

    static void findMaximumOdd(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int max = Integer.MIN_VALUE;

            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] % 2 != 0 && arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }

            if(max == Integer.MIN_VALUE)
            {
                System.out.println("No odd number");
            }
            else
            {
                System.out.println(max);
            }
        }
    }


    // 8. Sum of Maximum Elements in Every Row

    static int sumOfMaximumElements(int[][] arr)
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            int max = arr[i][0];

            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }

            sum = sum + max;
        }

        return sum;
    }



    // 9.Multiply main diagonal by 10

static int[][] mainDiagonal(int[][] arr)
{
    for(int i = 0; i < arr.length; i++)
    {
        for(int j = 0; j < arr[i].length; j++)
        {
            if(i == j)
            {
                arr[i][j] = arr[i][j] * 10;
            }
        }
    }
    return arr;
}


    // Helper Method: Print 2D Array

    static void printMatrix(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}