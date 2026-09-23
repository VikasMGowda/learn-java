public class FunctionsDay21 
{
    public static void main(String[] args) {
        // pass by value
        int number =10;
        number = makeItHalf(number);
        System.out.println(number);

        //pass by reference
        NewData myData = new NewData();
        myData.number = 100;
        makeItHalf(myData);
        System.out.println(myData.number);
        

    }

   //pass by value
    public  static  int makeItHalf(int number)
    {
        number = number / 2;
        return  number;
        
    }

 // pass by reference
    public  static  void makeItHalf(NewData myData)  // (NewData) class information (mydata) address
    {
    
        myData.number = myData.number / 2 ;
    
    }
}
