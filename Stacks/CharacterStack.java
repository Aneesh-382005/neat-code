package Stacks;

class Node
{
    char data;
    Node next;
    Node(char data)
    {
        this.data = data;
        next = null;
    }
}
class CharacterStack
{
    Node top;
    int currentSize;
    public CharacterStack()
    {
        this.top = null;
        this.currentSize = 0;
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }
    
    public void push(char data)
    {
        if(top == null)
        {
            top = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public char pop()
    {
        if(this.top == null)
        {
            System.out.println("Underflow Condition");
            return '\0';
        }
        char poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public void printStack()
    {
        Node current = top;
        System.out.print("Top --> ");
        while(current != null)
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

    public char peek()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty");
            return '\0';
        }
        return top.data;
    }
}