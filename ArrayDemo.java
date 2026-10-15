public class ArrayDemo
{
    public static void main(String[] args) 
    {
        MyArray myArray = new MyArray();
        System.out.println("Initial Array");
        myArray.printElements();

        //insert at end
        myArray.insertAtLast(20);
        myArray.insertAtLast(30);

        System.out.println("After Inserting 20 and 30 at end");
        myArray.printElements();

        //insert at start
        System.out.println("Insert at start");
        myArray.printElements();

        myArray.insertAtStart(5);

        System.out.println("After inserting 5 at start ");
        myArray.printElements();

        //insert at position
        System.out.println("Insert at postion");
        myArray.printElements();

        myArray.insertAtPosition(50, 2);
        


        System.out.println("After insert 50 at position at 2 ");
        myArray.printElements();

        
    }
}