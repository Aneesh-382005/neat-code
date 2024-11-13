public class LinkedListsExtended extends LinkedLists
{
    public void InsertAtBeginning(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int data)
    {
        if(head == null)
        {
            head = new Node(data);
            return;
        }

        Node current = head;
        while(current.next != null)
            current = current.next;
        current.next = new Node(data);
    }

    public void InsertAfter(int key, int data)
    {
        Node current = head;
        while(current != null)
        {
            if(current.data == key)
            {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    public void DeleteAtBeginning()
    {
        if(head == null)
            return;
        head = head.next;
    }

    public void DeleteAtEnd()
    {
        if(head == null)
            return;
        
        if(head.next == null)
        {
            head = null;
            return;
        }

        Node current = head;
        while(current.next.next != null)
            current = current.next;
        current.next = null;
    }

    public void DeleteAfter(int key)
    {
        Node current = head;
        while(current != null)
        {
            if(current.data == key && current.next != null)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void Position(int data)
    {
        Node current = head;
        int position = 0;
        while(current != null)
        {
            if(current.data == data)
            {
                System.out.println("Position of " + data + " is " + position);
                return;
            }
            position++;
        }
        System.out.println(data + " not found in the list");
    }
}
