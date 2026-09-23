public class Nameshow 
{
    static void show(String...names)
    {
        for(String n : names){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        show("vikas","varun","ravi");
    }
}
