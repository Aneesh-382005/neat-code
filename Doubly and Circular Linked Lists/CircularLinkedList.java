/*
Develop a menu driven program for the following operations of on a Circular as well as a Doubly Linked List.
(a)	Insertion anywhere in the linked list (As a first node, as a last node, and after/before a specific node).
(b)	Deletion of a specific node, say 'Delete Node 60'. That mean the node to be deleted may appear as a head node, last node or a node in between.
(c)	Search for a node.
 */

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CircularLinkedList
{
    Node head;
    Node tail;
    CircularLinkedList()
    {
        head = null;
        tail = null;
    }

    public void Insert(int data)
    {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void InsertAtFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
        else
        {
            newNode.next = head;
            head.prev = newNode;
        }
    }

    void InsertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
        }
    }

    void InsertAfter(int key, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do
        {
            if(current.data == key)
            {
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
                newNode.prev = current;
            }
        }while(current != head);
    }

    void InsertBefore(int key, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do
        {
            if(current.data == key)
            {
                newNode.next = current;
                newNode.prev = current.prev;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }while(current != head);
    }

    void Delete(int key)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do
        {
            if(current.data == key)
            {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }while(current != head);
    }

    void Search(int key)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do
        {
            if(current.data == key)
            {
                System.out.println("Key found");
                return;
            }
        }while(current != head);
        System.out.println("Key not found");
    }

    void Display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do
        {
            System.out.print(current.data + " ");
            current = current.next;
        }while(current != head);
        System.out.println();
    }

    int CountNodes()
    {
        if(head == null)
            return 0;
        int count = 0;
        Node current = head;
        do
        {
            count++;
            current = current.next;
        }while(current != head);
        return count;
    }
}