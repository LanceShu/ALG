package ALG;

/**
 * 实现时间复杂度为O(1);
 * */
public class 删除链表中的给定的结点 {

    public static class ListNode{
        int value;
        ListNode next;
    }

    public static ListNode deleteNode(ListNode head,ListNode toBeDeleted){

        if(head == null || toBeDeleted == null){
            return head;
        }

        if(head == toBeDeleted){
            return head.next;
        }

        if(toBeDeleted.next == null){
            ListNode tmp = head;
            while(tmp.next != toBeDeleted){
                tmp = tmp.next;
            }
            tmp.next = null;
        }else{
            toBeDeleted.value = toBeDeleted.next.value;
            toBeDeleted.next = toBeDeleted.next.next;
        }

        return head;

    }
}
