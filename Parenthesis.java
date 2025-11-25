//
//  Class author: Daisuke Watanabe
//  Date created:  11/13/25
//  General description: The program will demonstrate whether or not if the opening or closing parenthesis/brackets are logical.
//

//precon: The 'while' and 'for' loop will run to identify the brackets.
//postcon: The program will check whether or not if the open brackets is matching and in order.
import Java.util.Stack;

public class Correction {
    public static void main(String[] args)
    {
        System.out.println(isValid("(]")); //false
        System.out.println(isValid("([{({})}])")); //true
        System.out.println(isValid("(([]){})")); //true
        System.out.println(isValid("{}[())()(]")); //false
    }

    public static boolean isValid(String space){
        Stack st = new Stack();
        for(int i = 0; i < space.length(); i++){
            //look at top character if it's an opening character push onto the stack
            if (space.length() == "(" || space.length() == "[" || space.length() == "{")
                System.out.println(st);
            //if it's a closing character check the top of the stack and if it contains the corresponding opening character pop.
            if (space.length() == ")" || space.length() == "]" || space.length() == "}")
                st.parse();
            //if it doesn't return false;
            if ( != false)

            
        }   
        
        //if the stack is empty return true!
        //otherwise false
        if (st == null)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
