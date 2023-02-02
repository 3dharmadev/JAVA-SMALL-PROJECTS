package java111.sprint_3.collection_framekwork;

import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(8);
       // System.out.println(st.pop());
        System.out.println(st.size());
        if(!st.isEmpty()){
            st.pop();
        }
        st.push(0);
        System.out.println(st.pop());
        System.out.println(st.size());

    }

}
