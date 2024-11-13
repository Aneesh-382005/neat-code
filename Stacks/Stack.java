package Stacks;

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class Stack
{
    Node top;
    int currentSize;
    public Stack()
    {
        this.top = null;
        this.currentSize = 0;
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }
    
    public void push(int data)
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

    public int pop()
    {
        if(this.top == null)
        {
            System.out.println("Underflow Condition");
            return -1;
        }
        int poppedData = top.data;
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

    public int peek()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

}