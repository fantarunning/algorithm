package nodeList;

public class ListNode {
    int val;

    ListNode next;

    ListNode(int val){  //构造方法 ：构造方法和类名相同
        this.val=val;   //把接收的参数赋值给当前类的val变量
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
