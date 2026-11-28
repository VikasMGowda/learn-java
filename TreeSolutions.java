public class TreeSolutions
{
    public static void main(String[] args)
    {
        TreeNode root = createBinaryTree();

        System.out.println("\nInOrder Traversal");
        inOrderPrintTree(root);

        System.out.println("\nPreOrder Traversal");
        preOrderPrintTree(root);

        System.out.println("\nPostOrder Traversal");
        postOrderPrintTree(root);

        System.out.println();
        System.out.println("Count the nodes: " + getCountPrintTree(root));

        System.out.println();
        System.out.println("Key value Found : " + isKeyFound(root, 50));

        System.out.println();
        System.out.println("get Maximum Value : "+ getMaxValue(root));
    }

    public static TreeNode createBinaryTree()
    {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(60);

        root.right.left = new TreeNode(70);
        root.right.right = new TreeNode(90);

        return root;
    }

    // Inorder: Left -> Root -> Right
    public static void inOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return;

        inOrderPrintTree(root.left);

        System.out.print(root.data + " ");

        inOrderPrintTree(root.right);
    }

    // Preorder: Root -> Left -> Right
    public static void preOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return;

        System.out.print(root.data + " ");

        preOrderPrintTree(root.left);
        preOrderPrintTree(root.right);
    }

    // Postorder: Left -> Right -> Root
    public static void postOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return;

        postOrderPrintTree(root.left);
        postOrderPrintTree(root.right);

        System.out.print(root.data + " ");
    }


    public static int getCountPrintTree(TreeNode root)
{

    if(root == null)
        return 0;

    int leftCount = getCountPrintTree(root.left);

    int rightCount = getCountPrintTree(root.right);

    int myOwnCount = 1;

    // Total nodes
    int totalCount = myOwnCount + leftCount + rightCount;

    return totalCount;
    }

    public static boolean isKeyFound(TreeNode root, int key)
{

    if(root == null)
        return false;

    if(root.data == key)
        return true;

    boolean isKeyFoundLeft = isKeyFound(root.left, key);
    boolean isKeyFoundRight = isKeyFound(root.right, key);

    boolean isFound = isKeyFoundLeft || isKeyFoundRight;
    return isFound;

}

public static int getMaxValue(TreeNode root)
{
    if(root == null)
        return Integer.MIN_VALUE;

    int leftMaxValue = getMaxValue(root.left);
    int rightMaxValue = getMaxValue(root.right);

    return getMaxValue(root);

}


}
