public class SinglyLinkedList
{
    public static void main(String[] args)
    {
        //testInsertOperations();
        testDeleteOperations();
    }


    // INSERT TEST

    public static void testInsertOperations()
    {
        Node head = null;

        // Insert at beginning
        System.out.println("Insert at beginning:");

        head = insertAtbegin(100, head);
        head = insertAtbegin(300, head);
        head = insertAtbegin(400, head);
        head = insertAtbegin(500, head);

        printList(head);


        // Insert at end
        System.out.println("Insert at end:");

        head = insertAtEnd(head, 200);

        printList(head);


        // Insert at middle
        System.out.println("Insert at middle:");

        insertAtMiddle(head, 300, 600);

        printList(head);
    }


    // DELETE TEST


    public static void testDeleteOperations()
    {
        Node head = null;

        // Insert one node
        head = insertAtbegin(1, head);

        System.out.println("Original list:");
        printList(head);


        // Delete at start
        System.out.println("Delete at start:");

        head = deleteAtStart(head);

        printList(head);


        // Create list again
        head = insertAtbegin(2, head);
        head = insertAtbegin(3, head);
        head = insertAtbegin(4, head);
        head = insertAtbegin(5, head);

        System.out.println("List before deletion:");
        printList(head);


        // Delete at end
        System.out.println("Delete at end:");

        head = deleteAtEndNode(head);

        printList(head);


        // Delete at middle/key
        System.out.println("Delete key 3:");

        head = deleteKeyNode(head, 3);

        printList(head);
    }


    // DELETE AT START


    public static Node deleteAtStart(Node head)
    {
        if(head == null)
        {
            System.out.println("List is empty, no node to delete");
            return null;
        }

        return head.next;
    }


    // DELETE AT END

    public static Node deleteAtEndNode(Node head)
    {
        if(head == null)
        {
            return null;
        }

        // Only one node
        if(head.next == null)
        {
            return null;
        }

        Node temp = head;

        // Reach second-last node
        while(temp.next.next != null)
        {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;

        return head;
    }



    // DELETE BY KEY

    public static Node deleteKeyNode(Node head, int key)
    {
        if(head == null)
        {
            return null;
        }

        // Key is first node
        if(head.data == key)
        {
            return head.next;
        }

        Node prevNode = head;
        Node keyNode = head.next;

        while(keyNode != null)
        {
            if(keyNode.data == key)
            {
                prevNode.next = keyNode.next;
                return head;
            }

            prevNode = keyNode;
            keyNode = keyNode.next;
        }

        // Key not found
        return head;
    }


    // INSERT AT BEGINNING


    public static Node insertAtbegin(int value, Node currentHead)
    {
        Node newNode = new Node();

        newNode.data = value;
        newNode.next = currentHead;

        return newNode;
    }


    // INSERT AT END

    public static Node insertAtEnd(Node head, int value)
    {
        Node lastNode = new Node();

        lastNode.data = value;
        lastNode.next = null;

        if(head == null)
        {
            return lastNode;
        }

        Node currentlastNode = head;

        while(currentlastNode.next != null)
        {
            currentlastNode = currentlastNode.next;
        }

        currentlastNode.next = lastNode;

        return head;
    }


    // INSERT AFTER KEY

    static void insertAtMiddle(Node currentHead, int key, int value)
    {
        Node midNode = new Node();

        midNode.data = value;
        midNode.next = null;

        if(currentHead == null)
        {
            return;
        }

        Node keyNode = currentHead;

        while(keyNode != null && keyNode.data != key)
        {
            keyNode = keyNode.next;
        }

        if(keyNode == null)
        {
            return;
        }

        midNode.next = keyNode.next;
        keyNode.next = midNode;
    }


    // PRINT LIST
    

    public static void printList(Node head)
    {
        Node temp = head;

        System.out.print("head -> ");

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }
}