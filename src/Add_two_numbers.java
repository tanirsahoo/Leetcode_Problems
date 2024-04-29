//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

class calc_sum{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cpy_head , prev_ptr ;
        cpy_head = l1 ;
        prev_ptr = l1 ;
        int carry = 0 ;
        do{
            if(l1.next != null){
                prev_ptr = l1 ;
            }
            if((l1.val + l2.val + carry) / 10 != 0){
                int value = (l1.val + l2.val + carry) ;
                l1.val = value % 10 ;
                carry =  value / 10 ;
                l1 = l1.next ;
                l2 = l2.next ;
            }
            else{
                int value = (l1.val + l2.val + carry) ;
                carry = value / 10 ;
                l1.val = value % 10 ;
                l1 = l1.next ;
                l2 = l2.next ;
            }
        }while(l1 != null && l2 != null) ;
        if(l1 == null && l2 != null){
            l1 = prev_ptr.next ;
            l1.next = l2 ;
//            l2 = l2.next ;
            while (carry != 0){
                if(l2 != null) {
                    l2.val = (carry + l2.val) % 10;
                    carry = (carry + l2.val) / 10;
                    l2 = l2.next ;
                    l1 = l1.next ;
                }
                ListNode new_nd = new ListNode(carry % 10) ;
                carry = carry / 10 ;
                l1.next = new_nd ;
                l1 = l1.next ;
            }
        }else if (l2 == null && l1 != null) {
            l2 = prev_ptr.next ;
            l1 = prev_ptr.next ;
            while (carry != 0) {
                if(l1 != null) {
                    l1 = l1.next;
                    int value = carry + l2.val ;
                    l1.val = value % 10;
                    carry = value / 10;
                    l1 = l1.next ;
                    l2 = l2.next ;
                }
                ListNode new_nd = new ListNode(carry % 10) ;
                carry = carry / 10 ;
                l2.next = new_nd ;
                l2 = l2.next ;
            }
        }
        return cpy_head ;
    }
}

public class Add_two_numbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2) ;
        ListNode p = l1 ;
        ListNode l12 = new ListNode(4) ;
        ListNode l13 = new ListNode(3) ;

        ListNode l2 = new ListNode(5) ;
        ListNode q = l2 ;
        ListNode l22 = new ListNode(6) ;
        ListNode l23 = new ListNode(4) ;

        l1.next = l12 ;
        l12.next = l13 ;
        l13.next = null ;

        l2.next = l22 ;
        l22.next = l23 ;
        l23.next = null ;

        do{
            System.out.print(l1.val + " ");
            l1 = l1.next ;
        }while(l1 != null) ;
        System.out.println();
        do{
            System.out.print(l2.val + " ");
            l2 = l2.next ;
        }while(l2 != null) ;
        System.out.println();
        calc_sum ob = new calc_sum() ;
        l1 = ob.addTwoNumbers(p , q) ;
        do{
            System.out.print(l1.val);
            l1 = l1.next ;
        }while(l1 != null) ;
    }
}
