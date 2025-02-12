class Solution
{
    public boolean isValid(String s)
    {
        Stack<Character> ck = new Stack<>();
        char top;
        for(char c: s.toCharArray())
        {
            if(c == '(' || c == '[' || c == '{')
                ck.push(c);
            else
            {
                if(ck.isEmpty())
                    return false;
                top = ck.pop();
                if((c == ')' && top != '(') ||
                   (c == ']' && top != '[') ||
                   (c == '}' && top != '{'))
                    return false;
            }
        }
        return ck.isEmpty();
    }
}