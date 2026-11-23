public class Regex
{
    public static void main(String[] args)
    {
        //regex dot
        //dot macthes any charcter except new line
        String txt = "a";
        System.out.println(txt.matches(".")); //any character
        
        //matches with exactly one char from given set
        System.out.println(txt.matches("[abc]"));

        //matches with any first and second char
        System.out.println(txt.matches("[abc][vz]"));

        //matches with any but not with given set
        System.out.println(txt.matches("[^abc]"));

        //matches with lower cases a-z or 1-7
        System.out.println(txt.matches("[a-z1-7]"));

        //matches with Upper A or B
        System.out.println(txt.matches("[A|B]"));

        //matches with exactly in sequence
        System.out.println(txt.matches("[xz]"));
    }

}
