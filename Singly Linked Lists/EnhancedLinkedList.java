public class EnhancedLinkedList extends LinkedLists
{
    public int CountOccurences(int key)
    {
        int count = 0;
        Node current = head;
        while(current != null)
        {
            if(current.data == key)
                count ++;
            current = current.next;
        }
        return count;
    }

    public void DeleteAllOccurences(int key)
    {
        if(head == null)
            return;
        
        Node current = head;
        while(current != null && current.data == key)
        {
            head = current.next;
            current = head;
        }

        while(current != null && current.next != null)
        {
            if(current.next.data == key)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
    }
}
