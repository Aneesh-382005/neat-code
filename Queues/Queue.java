/*
 * Develop a menu driven program demonstrating the following operations on simple Queues: enqueue(), dequeue(), isEmpty(), isFull(), display(), and peek().
Note: Use either arrays or linked list to implement queue.
 */
package Queues;

public class Queue
{
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
    Node front, rear;
    int size;
    public Queue()
    {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public void Enqueue(int data)
    {
        Node newNode = new Node(data);
        if(rear == null)
        {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public int Dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        Node temp = front;
        front = front.next;
        if(front == null)
        {
            rear = null;
        }
        //System.out.println("Dequeued element: " + temp.data);
        size--;
        return temp.data;
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }
}
