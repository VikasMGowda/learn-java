public class StackMain
{
        public static void main(String[] args)
    {
        Stack myStack = new Stack(5);
        System.out.println("Is Empty : "+myStack.isEmpty());

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println();

        myStack.display();

        System.out.println("Top element "+ myStack.stackTop());
        System.out.println();

        System.out.println("Element at Position"+myStack.peek(1));
        System.out.println("Element at Position"+myStack.peek(2));
        System.out.println("Element at Position"+myStack.peek(3));
        System.out.println("Element at Position"+myStack.peek(4));
        System.out.println("Element at Position"+myStack.peek(5));
        System.out.println();

        System.out.println("Deleted " + myStack.pop());
        System.out.println("Deleted " + myStack.pop());
        System.out.println();



    }
}
