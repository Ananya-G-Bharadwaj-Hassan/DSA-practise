package DSA_practise;
import java.util.Stack;

class StackImplementation{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        //push
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        //pop
        System.out.println(st.pop());

        //peek
        System.out.println(st.peek());

        //search
        System.out.println(st.search(3));

        //size
        System.out.println(st.size());

        //empty
        System.out.println(st.empty());

        }
    }
