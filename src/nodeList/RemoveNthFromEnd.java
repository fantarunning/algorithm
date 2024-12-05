package nodeList;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fNode=head;
        ListNode sNode=head;
        ListNode dummyNode = new ListNode();
        dummyNode.next=head;
        int f=0;
        int s=0;
        while(dummyNode.next!=null){
            if(f-s>n){
                sNode=sNode.next;
                s++;
            }else if(f-s<n){
                fNode=fNode.next;
                dummyNode=dummyNode.next;
                f++;
            }else{
                if(fNode.next==null){

                }
            }
        }
    }
}
