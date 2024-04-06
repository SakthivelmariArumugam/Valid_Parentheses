import java.time.temporal.ChronoField;
import java.util.*;
public class Valid_parenthisis {
    public static void main(String args[])
    {
        Stack<Character> s1=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s1.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {

            if((s.charAt(i)=='}'&&!s1.isEmpty()&&s1.peek()=='{')||(s.charAt(i)==']'&&!s1.isEmpty()&&s1.peek()=='[')||(s.charAt(i)==')'&&!s1.isEmpty()&&s1.peek()=='('))
            {
                s1.pop();
            }
            else
            {
                s1.push(s.charAt(i));
            }



        }
        if(s1.isEmpty())
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
}
}