package nodeList;

public class SwapPairs {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        ListNode head = new ListNode(1);
        ListNode nextNode;                     //声明一个变量用来在移动过程中指向当前节点
        nextNode=head;                      //指向首节点

        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            nextNode.next= node;
            nextNode=nextNode.next;
        }
        nextNode=head;

        ListNode result = swapPairs(nextNode);
        while (result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }

    /*
    * 递归写法
    */
    public static ListNode swapPairs(ListNode head) {
        // base case 退出提交
        if(head == null || head.next == null) return head;
        // 获取当前节点的下一个节点
        ListNode next = head.next;
        // 进行递归
        ListNode newNode = swapPairs(next.next);
        // 这里进行交换
        next.next = head;
        head.next = newNode;

        return next;
    }

    /*
    * 三个临时节点写法
    */
    public ListNode swapPairs2(ListNode head) {
        ListNode dumyhead = new ListNode(-1); // 设置一个虚拟头结点
        dumyhead.next = head; // 将虚拟头结点指向head，这样方便后面做删除操作
        ListNode cur = dumyhead;
        ListNode temp; // 临时节点，保存两个节点后面的节点
        ListNode firstnode; // 临时节点，保存两个节点之中的第一个节点
        ListNode secondnode; // 临时节点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;       // 步骤一
            secondnode.next = firstnode; // 步骤二
            firstnode.next = temp;      // 步骤三
            cur = firstnode; // cur移动，准备下一轮交换
        }
        return dumyhead.next;
    }

    /*
    * 两个临时节点写法
    */
    // 将步骤 2,3 交换顺序，这样不用定义 temp 节点
    public ListNode swapPairs3(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode node1 = cur.next;// 第 1 个节点
            ListNode node2 = cur.next.next;// 第 2 个节点
            cur.next = node2; // 步骤 1
            node1.next = node2.next;// 步骤 3
            node2.next = node1;// 步骤 2
            cur = cur.next.next;
        }
        return dummy.next;
    }
}
