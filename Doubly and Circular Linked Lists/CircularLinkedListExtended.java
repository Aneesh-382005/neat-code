public class CircularLinkedListExtended extends CircularLinkedList
{
    public static boolean isCircular(Node head)
    {
        if (head == null)
            return true;

        Node current = head.next;
        while (current != null && current != head)
        {
            current = current.next;
        }

        return current == head;
    }
}
