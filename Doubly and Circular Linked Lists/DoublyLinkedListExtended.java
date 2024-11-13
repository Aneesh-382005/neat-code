public class DoublyLinkedListExtended extends DoublyLinkedList
{
    public static boolean isPalindrome(DoublyLinkedList list)
    {
        if (list == null || list.head == null)
            return false;

        Node left = list.head;
        Node right = list.tail;

        while (left != right && left.prev != right)
        {
            if (left.data != right.data)
                return false;

            left = left.next;
            right = right.prev;
        }

        return true;
    }
}
