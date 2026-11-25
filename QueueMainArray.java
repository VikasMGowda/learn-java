
public class QueueMainArray
{
    public static void main(String[] args)
    {
        QueueArray queue = new QueueArray(5);

        System.out.println("-----------");
        System.out.println("Initially");
        System.out.println("-----------");

        queue.display();

        System.out.println("Is Empty: " + queue.isEmpty());

        System.out.println("\n----------");
        System.out.println("Enqueue");
        System.out.println("----------");

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("\n----------");
        System.out.println("First");
        System.out.println("----------");

        System.out.println("First: " + queue.first());

        System.out.println("\n----------");
        System.out.println("Last");
        System.out.println("----------");

        System.out.println("Last: " + queue.last());

        System.out.println("\n----------");
        System.out.println("Dequeue");
        System.out.println("----------");

        System.out.println("Dequeued element: " + queue.dequeue());

        queue.display();

        System.out.println("\n--------------------");
        System.out.println("First after Dequeue");
        System.out.println("--------------------");

        System.out.println("First: " + queue.first());

        System.out.println("\n--------------------");
        System.out.println("Last after Dequeue");
        System.out.println("--------------------");

        System.out.println("Last: " + queue.last());

        System.out.println("\nIs Empty: " + queue.isEmpty());

        queue.display();
    }
}
