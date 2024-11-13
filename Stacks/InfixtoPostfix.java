package Stacks;
class InfixtoPostfix 
{
    public static void main(String[] args)
    {
        String infix = "A + ( B * (C - D) / E)";
        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + infixToPostfix(infix));

        
    }

    static int precedence(int ch)
        {
            switch(ch)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    static boolean isOperator(char ch)
    {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^');
    }

    static boolean isOperand(char ch)
    {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    static String infixToPostfix(String infix)
    {
        infix = infix.replaceAll("\\s", "");
        Stack stack = new Stack();
        String postfix = "";
        for(int i = 0; i < infix.length(); i++)
        {
            char ch = infix.charAt(i);
            if (ch == '(')
                stack.push(ch);

            else if (ch == ')')
            {
                while (stack != null && stack.peek() != '(')
                    postfix = postfix + (char)stack.pop();
                stack.pop();
            }

            else if (isOperator(ch))
            {
                while(stack != null && precedence(ch) <= precedence(stack.peek()))
                    postfix = postfix + (char) stack.pop();
            }
            
            else 
                postfix = postfix + ch;
        }
        while(!stack.isEmpty())
            postfix = postfix + stack.pop();

        return postfix;
    }
}
