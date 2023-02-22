public static String convertirInfixPostfix(String infix) {
    // Step 2
    Stack<Character> pila = new Stack<>();
    pila.push('#');

    StringBuilder postfix = new StringBuilder();

    // Step 3
    for (int i = 0; i < infix.length(); i++) {
        char ch = infix.charAt(i);

        // Step 4
        if (Character.isLetterOrDigit(ch)) {
            postfix.append(ch); // Step 5
        } else if (ch == '(') { // Step 6
            pila.push(ch); // Step 7
        } else if (ch == '^') { // Step 8
            pila.push(ch); // Step 9
        } else if (ch == ')') { // Step 10
            while (pila.peek() != '(') { // Step 11
                postfix.append(pila.pop()); // Step 12
            }
            pila.pop(); // Step 15
        } else { // Step 16
            while (pila.peek() != '#' && 
                   precedencia(ch) <= precedencia(pila.peek())) { // Step 17
                postfix.append(pila.pop()); // Step 18
            }
            pila.push(ch); // Step 21
        }
    }

    // Step 24
    while (pila.peek() != '#') {
        postfix.append(pila.pop()); // Step 25
    }

    // Step 27
    return postfix.toString();
}

// Función que retorna la precedencia de un operador
public static int precedencia(char ch) {
    switch (ch) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
    }
    return -1;
}