package Queues;
//Write a program interleave the first half of the queue with second half.
public class FirstSecond
{
    static void interLeaveQueue(Queue q)
    {
        if(q.size % 2 != 0)
        {
            System.out.println("Input even number of integers.");
            return;
        }

        int halfSize = q.size/2;

        for(int i = 0; i < halfSize; i++)
        {
            q.Enqueue(q.Dequeue());
        }

        for (int i = 0; i < halfSize; i++) {
            q.Enqueue(q.Dequeue());
            q.Enqueue(q.Dequeue());
        }
    }
}
