class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(1000);   //giving any temperory value to new node
        ListNode temp3=head;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                temp3.next=temp1;
                temp1=temp1.next;
                temp3=temp3.next;
            }
            else
            {
               temp3.next=temp2;
                temp2=temp2.next;
                temp3=temp3.next;
            }
        }
        if(temp1==null)
        {
            temp3.next=temp2;
        }
        else
        {
            temp3.next=temp1;
        }
        return head.next;
    }
}
