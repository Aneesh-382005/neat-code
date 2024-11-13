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
        head = prev;
    }

    public static void main(String[] args)
    {
        Reverse list = new Reverse();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        list.ReverseList();
        list.display();
    }
}
