public class MyStack
{

    public int[] value;
    private int top = -1;
    private int stackMaxSize = 0;

    public MyStack(int size)
    {
        this.value = new int[size];
        stackMaxSize = size;
    }
    
    public void push(int data)
    {
        if (this.top == this.stackMaxSize-1)
        {
            System.out.println("Push failed! Stack is full");
            return;
        }
        this.top++;
        this.value[top] = data;

    }

    public int pop()
    {
        if (this.top == -1)
        {
            System.out.println("Pop failed, stack is empty");
            return -1;
        }
        
        int data = this.value[top];
        this.top--;
        return data;

    }

    public int peek()
    {
        if (this.top == -1)
        {
            System.out.println("Peek failed, stack is empty");
            return -1;
        }

        return this.value[this.top];
    }

    public void print()
    {
        if (this.top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = this.top; i >=0; i--)
        {
            System.out.println(" [ " + i + " ]  --> " + this.value[i]);
        }
    }
public static void main(String[] args) {

    MyStack stack = new MyStack(5);

    stack.push(5);
    stack.push(10);
    stack.push(15);
    stack.push(20);

    stack.print();

    System.out.println(stack.peek());

    System.out.println(stack.pop());

    stack.print();
}
}
