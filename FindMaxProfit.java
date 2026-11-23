public class FindMaxProfit
{
    static double  getMax_Profit(double [] stock)
    {
        double currentstock = 0;
        double maxstock = Double.MIN_VALUE;

        for(int i = 0; i < stock.length; i++)
        {
            for(int j = i+1; j < stock.length; j++)
            {
                currentstock = stock[j] - stock[i];
            
            if(currentstock > maxstock)
            {
                maxstock = currentstock;
            }
            }
        }
        return maxstock;
    }
    public static void main(String[] args) 
    {
        double[] stock = {1.2 ,1.5, 6.4, 3.2};
        System.out.println(getMax_Profit(stock));
        
    }
}
