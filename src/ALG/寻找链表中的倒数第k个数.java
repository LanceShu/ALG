package ALG;

public class 寻找链表中的倒数第k个数 {

    public static void main(String[] args) {

    }

    public static class  ListNode{
        int value;
        ListNode next;
    }

    public static ListNode findKthToTail(ListNode head,int k){
        if( k <1 || head == null){
            return null;
        }

        ListNode pointer = head;

        for(int i =1;i<k;k++){
            if(pointer != null){
                pointer = pointer.next;
            }else{
                return null;
            }
        }

        while(pointer.next != null){
            head = head.next;
            pointer = pointer.next;
        }

        return head;
    }
}
