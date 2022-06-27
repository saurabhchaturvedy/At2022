package main.java.SinglyLinkedList;

public class SinglyLinkedList {

    ListNode root;

    private static class ListNode
    {

        int data;
        ListNode next;

        ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    private static void printList(ListNode head)
    {

        if(head==null) return;
        ListNode temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
    }

    private static int length(ListNode head)
    {

        if(head==null) return 0;
        ListNode temp = head;
        int count=0;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }

        return count;

    }

    private static ListNode insertNodeAtStart(ListNode head,int data)
    {

        if(head==null)
            return new ListNode(data);

        ListNode newNode = new ListNode(data);

        newNode.next=head;
        head=newNode;

        return newNode;

    }

    private static ListNode insertNodeAtEnd(ListNode head,int data)
    {

        if(head==null)
            return new ListNode(data);

        ListNode newNode = new ListNode(data);

       ListNode temp = head;

       while (temp.next!=null)
       {
           temp = temp.next;
       }
temp.next = newNode;

       return head;

    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        ListNode first = new ListNode(10);
        singlyLinkedList.root=first;
        first.next=new ListNode(20);
        first.next.next=new ListNode(30);

        printList(first);

        System.out.println("length of the linked list is :: "+length(first));

        first = insertNodeAtStart(first, 80);

        printList(first);

        first = insertNodeAtEnd(first, 90);

        printList(first);
    }
}
