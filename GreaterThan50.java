public class GreaterThan50
{
    public static void main(String[] args)
    {
        int[][] arr = {{30, 50, 9},
            {7, 6, 2},
            {40, 8, 10}
        };

        int result = getElementsByGreaterThan50(arr);

        System.out.println(result);
    }

    static int getElementsByGreaterThan50(int[][] arr)
    {
        int count = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
        
            for(int j = 0; j < arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }

            if(sum > 5)
            {
                count++;
            }
        }

        return count;
    }
}