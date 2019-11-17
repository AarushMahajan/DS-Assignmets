import java.util.*;
class BalancedParenthesis
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character> s=new Stack<Character>();
        int i=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(' || str.charAt(i)=='['|| str.charAt(i)=='{')
            {
                s.push(str.charAt(i));
            }
             if((str.charAt(i)==')'&& s.peek()=='(')|| (str.charAt(i)==']'&& s.peek()=='[')||( str.charAt(i)=='}'&& s.peek()=='{'))
             {
                 s.pop();
             }
        }
        if(s.isEmpty())
        System.out.print("Balanced");
        else
        System.out.println("unbalanced");
    }
}