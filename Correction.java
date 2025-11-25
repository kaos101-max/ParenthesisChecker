//
//  Class author: Daisuke Watanabe
//  Date created:  11/13/25
//  General description: The program will demonstrate whether or not if the opening or closing parenthesis/brackets are logical.
//

//precon: The 'while' and 'for' loop will run to identify the brackets.
//postcon: The program will check whether or not if the open/closing brackets is matching and in order.
import java.util.Stack;

public class Correction {
    public static void main(String[] args)
    {
        System.out.println(isValid("(]")); //false
        System.out.println(isValid("([{({})}])")); //true
        System.out.println(isValid("(([]){})")); //true
        System.out.println(isValid("{}[())()(]")); //false
    }

    public static boolean isValid(String space){
        Stack<String> st = new Stack();
        for(int i = 0; i < space.length(); i++){
            System.out.println(space.charAt(i));
            //look at top character if it's an opening character push onto the stack
            if (space.charAt(i)== '(' || space.charAt(i) == '[' || space.charAt(i) == '{'){
                st.push(space.charAt(i)+"");
            }
            //if it's a closing character check the top of the stack and if it contains the corresponding opening character pop.
            if(space.charAt(i)== ')'){
                if(st.peek().equals("(")){
                    st.pop();
                    }
                    
                    else{
                        System.out.println(1);
                        return false;
                    }
            }
            if(space.charAt(i)== ']'){
                if(st.peek().equals("[")){
                    st.pop();
                    }
                    else{
                           System.out.println(1);
                        return false;
                    }
                }
                
            if(space.charAt(i)== '}'){
                if(st.peek().equals("{")){
                    st.pop();
                    }
                    else{
                        System.out.println(1);
                        return false;
                    }
                }
                
            }
        //if the stack is empty return true!
        //otherwise false
        if (st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
