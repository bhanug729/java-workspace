package $00_Coding_Exercise;

import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

// Generate Parentheses
public class LeetCodeExercise2 {

	public static void main(String[] args) {
		int n = 2;
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0, 0, n);
		System.out.println(result);
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode op = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				op.next = list1;
				list1 = list1.next;
			} else {
				op.next = list2;
				list2 = list2.next;
			}
			op = op.next;
		}
		op.next = (list1 != null) ? list1 : list2;

		return dummy.next;
	}

	private static void backtrack(List<String> result, String current, int openCount, int closeCount, int n) {
		if (openCount == n && closeCount == n) {
			result.add(current);
			return;
		}

		if (openCount < n) {
			backtrack(result, current + "(", openCount + 1, closeCount, n);
		}
		if (closeCount < openCount) {
			backtrack(result, current + ")", openCount, closeCount + 1, n);
		}
	}
}