public class StackWithExpression
{
    public static void main(String[] args)
    {
        MyStack myStack = new MyStack(4);

        myStack.push('(');
        myStack.push(')');
        myStack.push('(');
        myStack.push(')');
        myStack.push(')');

        myStack.print();

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());

        myStack.print();
    }
    boolean isBalancedExpression(String exp)
{
    if(exp == null)
        return false;

    MyStack myStack = new MyStack(exp.length());

    for(int i = 0; i < exp.length(); i++)
    {
        char ch = exp.charAt(i);

        if(ch == '(')
        {
            myStack.push(ch);
        }
        else if(ch == ')')
        {
            if(myStack.peek() == -1)
            {
                return false;
            }

            myStack.pop();
        }
    }

    return myStack.peek() == -1;
}
}
