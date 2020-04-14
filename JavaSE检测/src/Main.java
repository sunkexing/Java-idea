 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
//合并两个单链表   <不用傀儡节点>
public class Main {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode node=null;
        ListNode cur=null;
        while (list1!=null && list2!=null){
            if(list1.val<=list2.val){
                if(node==null){
                    node=list1;
                    cur=list1;
                }else {
                    cur.next=list1;
                    cur=cur.next;
                }
                list1=list1.next;
            }else {
                if(node==null){
                    node=list2;
                    cur=list2;
                }else {
                    cur.next=list2;
                    cur=cur.next;
                }
                list2=list2.next;
            }
        }
        if(list1==null){
            cur.next=list2;
        }
        if(list2==null){
            cur.next=list1;
        }
        return node;
    }
}
