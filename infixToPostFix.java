public static String infixToPostfix(String infix) {
    String postfix = "";
    Stack<Character> stack = new Stack<>();
    stack.push('#'); // push some special character into the stack initially
    for (int i = 0; i < infix.length(); i++) {
        char ch = infix.charAt(i);
        if (Character.isLetterOrDigit(ch)) { // if ch is alphanumeric character
            postfix += ch; // add ch to postfix expression (queue or list)
        } else if (ch == '(') { // if ch = opening parenthesis (
            stack.push(ch); // push ( into stack
        } else if (ch == '^') { // if ch = ^ (any operator of higher precedence)
            stack.push(ch); // push ^ into stack
        } else if (ch == ')') { // if ch = closing parenthesis )
            while (stack.peek() != '(') { // while stack is not empty and stack top ≠ (
                postfix += stack.pop(); // pop and add item from stack to postfix expression
            }
            stack.pop(); // pop ( also from the stack
        } else { // if ch is an operator
            while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                // while stack is not empty and precedence of ch <= precedence of stack top element
                postfix += stack.pop(); // pop and add into postfix expression
            }
            stack.push(ch); // push the newly coming character.
        }
    }
    while (!stack.isEmpty() && stack.peek() != '#') { // while the stack contains some remaining characters
        postfix += stack.pop(); // pop and add to the postfix expression
    }
    return postfix;
}

public static int precedence(char ch) {
    switch (ch) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
        default:
            return 0;
    }
}
