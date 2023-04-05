import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("请输入链表");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        ListNode head = null;
        ListNode phead = null;
        while((i=scanner.nextInt())!=9527){
            if(head == null){
                head = new ListNode(i);
                phead = head;
            }else{
                head.next = new ListNode(i);
                head = head.next;
            }


        }
        ListNode listNode = reverseList(phead);
        while(listNode!= null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while(cur!= null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
