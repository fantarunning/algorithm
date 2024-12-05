package nodeList;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        ListNode head = new ListNode(0);
        ListNode nextNode;                     //声明一个变量用来在移动过程中指向当前节点
        nextNode=head;                      //指向首节点

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(i);
            nextNode.next= node;
            nextNode=nextNode.next;
        }
        nextNode=head;

        ListNode result = reverseList(nextNode);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        // 边缘条件判断
        if(head == null) return null;
        if (head.next == null) return head;

        // 递归调用，翻转第二个节点开始往后的链表
        ListNode last = reverseList(head.next);
        // 翻转头节点与第二个节点的指向
        head.next.next = head;
        // 此时的 head 节点为尾节点，next 需要指向 NULL
        head.next = null;
        return last;
    }
}
