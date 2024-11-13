public class DoublyLinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public static DoublyLinkedList insertAtEnd(DoublyLinkedList list, int data)
    {
        Node newNode = new Node(data);

        if(list.head == null)
            list.head = newNode;
        else
        {
            Node current = list.head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        return list;
    }

    public static void DeleteByKey(DoublyLinkedList list, int key)
    {
        if(list.head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node current = list.head;
        while(current != null && current.data != key)
        {
            current = current.next;
        }
        if (current == null)
        {
            System.out.println("Key not found");
            return;
        }
        if (current == list.head)
        {
            list.head = current.next;
            list.head.prev = null;
        }
        else if (current.next == null)
        {
            (current.prev).next = null;
        }
        else
        {
            (current.prev).next = current.next;
            (current.next).prev = current.prev;
        }
    }

    public static void InsertAtBeginning(DoublyLinkedList list, int key)
    {
        Node newNode = new Node(key);
        Node current = list.head;
        list.head = newNode;
        newNode.next = current;
        current.prev = newNode;
    }

    public static void printList(DoublyLinkedList list)
    {
        Node current = list.head;
        System.out.print("Head --> ");
        while (current.next != null)
        {
            System.out.print(current.data + " --> <-- ");
            current = current.next;
        }
        System.out.print(current.data + " --> Tail");
    }
}
