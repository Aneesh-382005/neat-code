/*
Develop a menu driven program for the following operations of on a Circular as well as a Doubly Linked List.
(a)	Insertion anywhere in the linked list (As a first node, as a last node, and after/before a specific node).
(b)	Deletion of a specific node, say 'Delete Node 60'. That mean the node to be deleted may appear as a head node, last node or a node in between.
(c)	Search for a node.
 */
import java.util.Scanner;

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
        }
    }
}