public class Reverse extends LinkedLists
{
    public void ReverseList()
    {
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }
}
