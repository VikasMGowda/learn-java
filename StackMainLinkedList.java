
public class StackMainLinkedList
{
    public static void main(String[] args)
    {
        // Creates an object of StackLinkedList class
        StackLinkedList stack = new StackLinkedList();

        // Displays the initial heading
        System.out.println("----------");
        System.out.println("Initially");
        System.out.println("----------");

        // Displays stack elements
        // Since stack is empty, it prints Stack is Empty
        stack.display();

        // Checks whether stack is empty
        System.out.println();

        System.out.println("Is Empty: " + stack.isEmpty());

        // Push operation heading
        System.out.println();
        System.out.println("Push");

        // Inserts elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Displays all inserted elements
        stack.display();

        // Peek operation heading
        System.out.println();
        System.out.println("Peek the Top Element");

        // Returns the top element without deleting it
        System.out.println("Top Element: " + stack.peek());

        // Peek at position heading
        System.out.println();
        System.out.println("Peek the Position");

        // Returns the element at each position
        System.out.println("Position 1 - " + stack.peek(1));
        System.out.println("Position 2 - " + stack.peek(2));
        System.out.println("Position 3 - " + stack.peek(3));
        System.out.println("Position 4 - " + stack.peek(4));
        System.out.println("Position 5 - " + stack.peek(5));

        // Pop operation heading
        System.out.println();
        System.out.println("Pop");

        // Removes and returns the top element
        System.out.println("Popped Element - " + stack.pop());

        // Displays stack after removing the top element
        stack.display();

        // Checks the new top element after pop
        System.out.println();
        System.out.println("Top After the Pop");

        System.out.println("Top Element: " + stack.peek());

        // Checks whether stack is empty after operations
        System.out.println();
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
