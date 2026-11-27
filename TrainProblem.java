import java.util.Arrays;

public class TrainProblem
{
    public static void main(String[] args) {
        int[] arrival ={1030,1035,1040,1045,1050};
        int[] departure ={1037,1042,1050,1053,1150};

        int minPlatformCount = getMinPlatforms(arrival, departure);
        System.out.println("Minimum number platform required is = "+ minPlatformCount);
    }

    public static int getMinPlatforms(int[]arrivalTime, int[]departureTime)
    {
        int currentCount = 0;
        int maxSoFar =0;

        Arrays.sort(arrivalTime);
        Arrays.sort(departureTime);

        for(int i=0; i<arrivalTime.length; i++)
        {
            System.out.println(arrivalTime[i]);
        }
        return currentCount;
    }

}
