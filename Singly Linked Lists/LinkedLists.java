class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedLists
{
    Node head;
    public LinkedLists()
    {
        this.head = null;
    }

    public void add(int data)
    {
        if(head == null)
            head = new Node(data);

        else
        {
            Node current = head;
            while(current.next != null)
                current = current.next;
            current.next = new Node(data);
        }
    }

    public void display()
    {
        Node current = head;
        System.out.print("HEAD");
        while(current != null)
        {
            System.out.print(" --> " + current.data);
            current = current.next;
        }
        System.out.println(" --> NULL");
    }

    public void delete(int data)
    {
        if(head == null)
            return;
        
        if(head.data == data)
        {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null)
        {
            if(current.next.data == data)
            {
                current.next = current.next.next;
                return;
            }
        }
    }
}