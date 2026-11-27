import java.util.Arrays;

public class TrainProblem
{
    public static void main(String[] args)
    {
        int[] arrival = {1030,1035,1040,1045,1050};
        int[] departure = {1037,1042,1050,1053,1150};

        int minPlatformCount = getMinPlatforms(arrival, departure);

        System.out.println("Minimum number of platforms required is = "
                        + minPlatformCount);
    }

    public static int getMinPlatforms(int[] arrivalTime,
                                    int[] departureTime)
    {
        int currentCount = 0;
        int maxSoFar = 0;

        Arrays.sort(arrivalTime);
        Arrays.sort(departureTime);

        int i = 0;
        int j = 0;

        while(i < arrivalTime.length)
        {
            if(arrivalTime[i] <= departureTime[j])
            {
                currentCount++;

                maxSoFar = Math.max(currentCount, maxSoFar);

                i++;
            }
            else
            {
                currentCount--;
                j++;
            }
        }

        return maxSoFar;
    }
}
