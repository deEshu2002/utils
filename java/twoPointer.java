class ListNode{
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}


ListNode findFromEnd(ListNode head, int k){
    ListNode p1 = head;

    for(int i = 0; i < k; i++){
        p1 = p1.next;
    }
    ListNode p2 = head;
    while(p1 != null){
        p2 = p2.next;
        p1 = p1.next;
    }
    return p2;
}

ListNode middleFromEnd(ListNode head){
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

ListNode hasCycle(ListNode head){
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null | fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow == fast){
            return true;
        }
    }
    return false;
}

ListNode detectCycle(ListNode head){
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast) break;
    }

    if(fast == null || fast.next == null){
        return null;
    }

    slow = head;
    while(slow != fast){
        slow = slow.next;
        fast = fast.next;
    }

    return slow;
}

ListNode getIntersectionNode(ListNode head1, ListNode head2){
    ListNode p1 = head1;
    ListNode p2 = head2;

    while(p1 != p2){
        if(p1.next == null) p1 = head1;
        else                p1 = p1.next;
        if(p2.next == null) p2 = head1;
        else                p2 = p2.next;
    }
    return p1;
}

ListNode getIntersectionNodeUsingLoopCreation(ListNode head1, ListNode head2){
    int len1 = head1;
    int len2 = head2;

    for(ListNode i = head1; i != null; i=i.next){
        len1++;
    }
    for(ListNode i = head2; i != null; i=i.next){
        len2++;
    }

    ListNode p1 = head1, p2 = head2;
    if(len1 > len2){
        for(int i = 0; i < len1-len2; i++){
            p1 = p1.next;
        }
    }else{
        for(int i = 0; i < len2-len1; i++){
            p2 = p2.next;
        }
    }
    while(p1 != p1){
        p1 = p1.next;
        p2 = p2.next;
    }
    return p1;
}
