class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode cur = head;
        
        while (cur != null) {
            if (cur.val == val) {
                if (cur == head) {
                    head = cur.next;
                } else {
                    prev.next = cur.next;
                }
            } else {
                prev = cur;
            }
            
            cur = cur.next;
        }
        
        return head;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            
            cur = cur.next;
        }
        
        if (head.val == val) {
            head = head.next;
        }
        
        return head;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmpHead = new ListNode(-1);
        tmpHead.next = head;
        ListNode prev = tmpHead;
        ListNode cur = head;
        
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            
            cur = cur.next;
        }
        
        return tmpHead.next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = null;
        ListNode last = null;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                ListNode next = cur1.next;
                
                if (result == null) {
                    result = cur1;
                } else {
                    last.next = cur1;
                }
                last = cur1;
                
                cur1 = next;
            } else {
                ListNode next = cur2.next;
                
                if (result == null) {
                    result = cur2;
                } else {
                    last.next = cur2;x
                }
                last = cur2;
                
                cur2 = next;
            }
        }
        
        if (cur1 != null) {
            last.next = cur1;
        } else {
            last.next = cur2;
        }
        
        return result;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        
        while (cur1 != null || cur2 != null) {
            if (cur1 == null) {
                // 尾插 cur2
            } else if (cur2 == null) {
                // 尾插 cur1
            } else {
                if (cur1.val <= cur2.val) {
                }
            }
        }
    }
}