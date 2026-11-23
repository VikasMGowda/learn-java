public class MyQueue
{
    private int[] values;
    private int first = 0;
    private int last = 0;
    private int size = 0;
    private int count = 0;

    public MyQueue(int size)
    {
        this.size = size;
        this.values = new int[size];
    }

    public void enqueue(int value)
    {
        if(last == size)
        {
            System.out.println("Queue is full");
            return;
        }

        values[last] = value;
        last++;
        count++;
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }

        int index = first;
        first++;
        count--;

        return values[index];
    }

    public int peek()
    {
        if(isEmpty())
            return -1;

        return values[first];
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public int getCount()
    {
        return count;
    }

    public void print()
    {
        for(int i = first; i < last; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
{
    MyQueue q = new MyQueue(5);

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    q.print();

    System.out.println("Dequeued: " + q.dequeue());

    q.print();

    System.out.println("Front element: " + q.peek());
    System.out.println("Count: " + q.getCount());
}
}