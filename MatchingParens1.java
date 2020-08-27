import java.util.Stack;


public class MatchingParens {

  public static boolean isValid(String s) {
    Stack<String> stack = new Stack();
    String[] parens = s.split("");

    for (String paren : parens) {
      if (paren.equals("(") || paren.equals("{") || paren.equals("[")) {
        stack.push(paren);
      } else if(stack.empty()) {
        return false;
      } else if ((paren.equals(")") && stack.peek().equals("("))
          || (paren.equals("}") && stack.peek().equals("{"))
          || (paren.equals("]") && stack.peek().equals("["))) {
        stack.pop();
      }
    }
    return stack.empty();
  }


  public static void main(String[] args) {
    System.out.println(isValid("]"));
    System.out.println(isValid("()"));
    System.out.println(isValid("(){}"));
    System.out.println(isValid("[{()}]"));

  }

}