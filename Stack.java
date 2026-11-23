public class Stack
{
    private int top = -1;
    private int size = 0;
    public  int value[];

    public void stack(int sizeofStack)
    {
        this.value = new int[sizeofStack];
        this.size = sizeofStack;
    }

    public void push(int value)
    {
        this.top++;
        this.value[this.top] = value;
    }

    public int peek()
    {
        return this.value[this.top];

    }

    public int pop()
    {
        int index= this.top;
        this.top--;
        return this.value[index];

    }
}
