package ALG;

import java.util.Stack;

public class 链表尾节点打印 {

    static class ListMode{
        int val;
        ListMode nxt;
    }

    public static void printList(ListMode root){
        Stack<ListMode> stack = new Stack<>();
        while(root != null){
            stack.push(root);
            root = root.nxt;
        }
        ListMode tmp;
        while(!stack.isEmpty()){
            tmp = stack.pop();
            System.out.println(tmp.val);
        }
    }

    public static void printlistfor(ListMode listMode){
        if(listMode != null){
            printlistfor(listMode.nxt);
            System.out.println(listMode.val);
        }
    }

    public static void main(String[] args) {
        ListMode listMode = new ListMode();
        ListMode list = listMode;
        listMode.val = 123;
        for(int i =0;i<10;i++){
            ListMode listMode1 = new ListMode();
            listMode1.val = i+1;
            listMode1.nxt = null;
            listMode.nxt = listMode1;
            listMode = listMode.nxt;
        }

//        printList(list);
        printlistfor(list);
    }

}
