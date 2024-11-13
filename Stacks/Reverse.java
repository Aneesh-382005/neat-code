package Stacks;

public class Reverse extends Stack
{
    public static String reverseString(String input) {
        Stack stack = new Stack();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        while (!stack.isEmpty()) {
            output += (char)stack.pop();
        }
        return output;
    }

    public static void main(String[] args) {
        String input = "data structure";
        String output = reverseString(input);
        System.out.println("Reversed string: " + output);
    }
}