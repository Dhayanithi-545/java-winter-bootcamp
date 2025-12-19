/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        ListNode temp = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;

        ListNode prev = null;

        while(slow != null){
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode left = head;
        ListNode right = prev;

        while(right != null && right.next != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
        
    }
    
}

public class PalindromeLL {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Solution sol = new Solution();
        System.out.println("Test 1 [1,2,2,1]: " + sol.isPalindrome(head1));
        
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        System.out.println("Test 2 [1,2,3,2,1]: " + sol.isPalindrome(head2));
        
        ListNode head3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println("Test 3 [1,2,3,4,5]: " + sol.isPalindrome(head3));
        
        ListNode head4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        System.out.println("Test 4 [9,9,9,9]: " + sol.isPalindrome(head4));
        
        ListNode head5 = new ListNode(1);
        System.out.println("Test 5 [1]: " + sol.isPalindrome(head5));
    }
}
