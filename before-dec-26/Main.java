
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int n = 0;

        while(temp != null){
            n++;
            temp = temp.next;
        }

        ListNode node = head;

        int mid = n/2;

        while(node != null){
            mid--;
            if(mid == 0){
                node.next = node.next.next;
            }
            node = node.next;
        }

        return head;



    }
}

public class Main{
    public static void main(String[] args){
        ListNode head1 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(2)))));
        Solution sol = new Solution();
        ListNode result1 = sol.deleteMiddle(head1);
        System.out.print("Test 1: ");
        printList(result1);
        
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result2 = sol.deleteMiddle(head2);
        System.out.print("Test 2: ");
        printList(result2);
        
        ListNode head3 = new ListNode(1);
        ListNode result3 = sol.deleteMiddle(head3);
        System.out.print("Test 3: ");
        printList(result3);
    }
    
    static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(", ");
            head = head.next;
        }
        System.out.println("]");
    }
}