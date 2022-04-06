package javaBasics;

import java.util.Stack;

public class Interview_BalancedCharacters {
    public static void main(String[] args) {
        
      String Sample1 = "()(){}[[[[({})({}{{}]][[][(({}}";
      String Sample2 = "({[)}]";
      System.out.println("Sample: "  + isBalanced(Sample1));
      System.out.println("Sample2: "  + isBalanced(Sample2));
    }
    public static boolean isBalanced (String str) {
        Stack <Character> chars = new Stack <Character>();
        for (Character c : str.toCharArray()) {
        if ( c == '(' || c == '{' || c == '[') {
            chars.add (c);
        } else {
            if (chars.size () < 1) {
                return false;
            }
            if (c== ')' && chars.pop() != '(' ) {
                return false;
            }
            if (c == '}' && chars.pop() != '{') {
                return false;
            }
            if (c == ']' && chars.pop() != '[') {
                return false;
        }
    } 
}
return chars.size() == 0;
}
}

