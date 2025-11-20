//
//  Class author: Daisuke Watanabe
//  Date created:  11/13/25
//  General description: The program will demonstrate whether or not if the parenthesis/brackets are logical.
//

//precon: The 'while' and 'for' loop will run to identify the parantheses.
//postcon: The program will check whether or not if the brackets/parenthesis is in the right place.
import Java.util.Stack;

public class Correction {
    public static void main(String[] args)
    {
        pars(isValid("(]")); //false
        System.out.println(isValid("([{({})}])")); //true
        System.out.println(isValid("(([]){})")); //true
        System.out.println(isValid("{}[())()(]")); //false
    }
    public static void pars(int space){
        String first = "(]";
        for (int i = space; i < 0; i++)

            
    }
}
