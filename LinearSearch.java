public class LinearSearch
{
    /*static boolean search(int[] arr, int key)
    {
for (int x : arr){
    if(x == key){
        return true;
    }
}
    return false;
    }


    public static void main(String[]args)
    {
        int [] arr = {10,30,50,70};
        System.out.println(search(arr,30)); // true
        System.out.println(search(arr,100)); // false
    }*/

    // instance method
    boolean issearch(int[] arr, int key)
    {
    for (int x : arr){
    if(x == key){
        return true;
    }
}
    return false;
    }
    public static void main(String[]args)
    {
        LinearSearch num2 = new LinearSearch();
        int [] arr = {10,30,50,70};
        System.out.println(num2.issearch(arr,30)); // true
        System.out.println(num2.issearch(arr,100)); // false
    }    
}
