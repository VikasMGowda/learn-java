class Node
{
    int data;       // Stores the value of the node
    Node next;      // Stores reference of the next node

    // Constructor to create a new node
    Node(int data)
    {
        this.data = data;  // Assigns value to data variable
        next = null;       // Initially next points to null
    }
}

public class StackLinkedList
{
    Node top;  // Points to the top node of the stack

    // Constructor of StackLinkedList
    StackLinkedList()
    {
        top = null;  // Initially stack is empty
    }

    // PUSH: Inserts an element at the top
    public void push(int value)
    {
        // Creates a new node with the given value
        Node newNode = new Node(value);

        // Connects new node to the existing top node
        newNode.next = top;

        // Updates top to point to the newly created node
        top = newNode;

        // Displays the inserted value
        System.out.println(value + " pushed");
    }

    // POP: Removes and returns the top element
    public int pop()
    {
        // Checks whether the stack is empty
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        // Stores the top element before deleting it
        int value = top.data;

        // Moves top to the next node
        top = top.next;

        // Returns the deleted element
        return value;
    }

    // PEEK: Returns the top element without deleting it
    public int peek()
    {
        // Checks whether the stack is empty
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        // Returns the data present at top
        return top.data;
    }

    // PEEK AT POSITION: Position starts from 1
    public int peek(int position)
    {
        // Checks whether the position is valid
        if(position <= 0)
        {
            System.out.println("Invalid Position");
            return -1;
        }

        // Creates a temporary reference starting from top
        Node temp = top;

        // Top element is at position 1
        int count = 1;

        // Traverses until the required position is reached
        while(temp != null && count < position)
        {
            // Moves to the next node
            temp = temp.next;

            // Increments the position counter
            count++;
        }

        // Checks whether the requested position exists
        if(temp == null)
        {
            System.out.println("Position does not exist");
            return -1;
        }

        // Returns the data at the requested position
        return temp.data;
    }

    // ISEMPTY: Checks whether stack is empty
    public boolean isEmpty()
    {
        // If top is null, stack is empty
        return top == null;
    }

    // DISPLAY: Prints all elements of the stack
    public void display()
    {
        // Checks whether stack is empty
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return;  // Exits the method
        }

        // Prints the top label
        System.out.println("TOP");

        // Creates a temporary reference starting from top
        Node temp = top;

        // Traverses until the last node
        while(temp != null)
        {
            // Prints current node data
            System.out.println(temp.data + " -->");

            // Moves to the next node
            temp = temp.next;
        }

        // Indicates the end of the linked list
        System.out.println("null");
    }
}
