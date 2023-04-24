package org.example.easy;


import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String x) {
        Stack<Character> s = new Stack<Character>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{' ||x.charAt(i)=='['|| x.charAt(i)=='('){
                s.push(x.charAt(i));
            }
            else{
                if(s.isEmpty()) return false;
                if((s.peek()=='(' && x.charAt(i)==')') || (s.peek()=='{' && x.charAt(i)=='}')|| (s.peek()=='[' && x.charAt(i)==']'))
                {
                    s.pop();
                }
                else return false;
            }
        }
        return (s.isEmpty());
    }
}
