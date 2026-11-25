public class QueueArray
{
    int size;
    int front;
    int rear;
    int[] queue;

    QueueArray(int size)
    {
        this.size= size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    //enqueue
    public void enqueue(int value)
    {
        if(rear == size-1)
        {
        System.out.println("Queue is Full");
        return;
        }

        rear++;
        queue[rear]=value;

        System.out.println(value + "value Inserted");
    }

    //dequeue
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        front++;
        return queue[front];
    }

    //isEmpty
    public boolean isEmpty()
    {
        return front == rear;
    }

    //isFull
    public boolean isFull()
    {
        return rear == size-1;
    }

    //first()
    public int first()
    {
        if(isFull())
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[front + 1];
    }

    //last()
    public int last()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[rear];
    }

    //display()
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty go back");
            return;
        }

        System.out.println("Front");

        for(int i = front+1; i <= rear; i++)
        {
            System.out.println(queue[i]);
            System.out.println("-----------");
            System.out.println("-----------");
        }
    }





    
}
