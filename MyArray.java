public class MyArray
{
    int [] array;
    int length;
    int rightIndex; // pointing at empty box

    public MyArray()
    {
        length = 5;
        array = new int [length];  //[0][0][0][0][0]
        rightIndex = 0;
    }

    // insert at end
    public void insertAtLast(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is Full : ");
            return;
        }
        array[rightIndex] = value;
        rightIndex++; // after inserting at the end size go increased
    }

    //insert at first
    public void insertAtStart(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is Full : ");
            return;
        }
        else
        {
            for(int i = rightIndex - 1; i >= 0; i--)
            {
                array[i+1] = array[i];
            }
        }
        array[0] = value;
        rightIndex++;
    }

    //insert at position
    public void insertAtPosition(int value, int temp)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is full : ");
            return;
        }
        if(temp < 0  || temp > rightIndex)
        {
            System.out.println("Invalid position : ");
            return;
        }
        for(int i = rightIndex-1; i >= temp; i--)
        {
            array[i+1] = array[i];
        }
        array[temp] = value;
        rightIndex++;
    }
    //print elements
    public void printElements()
    {
        System.out.println("index\tvalue");
        for(int i = 0; i < length; i++)
        {
            System.out.println(i+ "\t" + array[i]);
        }
        System.out.println("size " + rightIndex);
        System.out.println();
    }
}