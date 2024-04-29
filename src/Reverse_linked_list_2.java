import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ld = head ;
        ListNode next_nd ;
        for(int i = 1 ; i < (left - 1); i ++){
            ld = ld.next ;
        }
        if(left != 1) {
            ListNode temp = ld;
            next_nd = ld.next;
            for (int i = (left - 1); i < right; i++) {
                ListNode temp_node = next_nd.next;
                next_nd.next = ld;
                ld = next_nd;
                next_nd = temp_node;
            }
            temp.next.next = next_nd;
            temp.next = ld;
        }
        else{
            ListNode temp = ld;
            next_nd = ld.next;
            for (int i = (left - 1); i < right; i++) {
                ListNode temp_node = next_nd.next;
                next_nd.next = ld;
                ld = next_nd;
                next_nd = temp_node;
            }
            temp.next.next = next_nd ;
            head = ld ;
        }
        return head ;
    }

    public void display(ListNode hd){
        ListNode head = hd ;
        do{
            System.out.print(head.val + " ");
            head = head.next ;
        }while(head != null) ;
        System.out.println();
    }
}

public class Reverse_linked_list_2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2) ;
        ListNode l2 = new ListNode(4) ;
        ListNode l3 = new ListNode(8) ;
        ListNode l4 = new ListNode(9) ;
        ListNode l5 = new ListNode(6) ;
        ListNode l6 = new ListNode(3) ;

        l1.next = l2 ;
        l2.next = l3 ;
        l3.next = l4 ;
        l4.next = l5 ;
        l5.next = l6 ;
        l6.next = null ;

        Solution ob = new Solution() ;
        ob.display(l1);
        l1 = ob.reverseBetween(l1 , 1 , 6) ;
        ob.display(l1);

    }
}
