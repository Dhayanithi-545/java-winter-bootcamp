public class MergeTwoLL {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 == null) return list2;
		if(list2 == null) return list1;

		if(list1 == null && list2 == null) return null;

		ListNode dummy = new ListNode(-1);
		ListNode current = dummy;

		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				current.next = list1;
				list1 = list1.next;
			} else{
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}
		current.next = list1 != null ? list1 : list2;

		return dummy.next;
	}

	public static void main(String[] args) {
		MergeTwoLL solver = new MergeTwoLL();
		ListNode a = new ListNode(1, new ListNode(3, new ListNode(5)));
		ListNode b = new ListNode(2, new ListNode(4, new ListNode(6)));
		ListNode res = solver.mergeTwoLists(a, b);
		while (res != null) {
			System.out.print(res.val + " ");
			res = res.next;
		}
		System.out.println();
	}

}
