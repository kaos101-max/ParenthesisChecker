//
//  Class author: Daisuke Watanabe
//  Date created:  11/13/25
//  General description: The program will demonstrate whether or not if the parenthesis/brackets are logical.
//

//precon: The parenthsis will confirmed in shuffled illogical order
//postcon: The program will check whether or not if the brackets/parenthesis is in the right place.
import Java.util.Stack;

public class Correction {
    public static void main(String[] args)
    {
        System.out.println(isValid("(]")); //false
        System.out.println(isValid("([{({})}])")); //true
        System.out.println(isValid("(([]){})")); //true
        System.out.println(isValid("{}[())()(]")); //false
    }
}
