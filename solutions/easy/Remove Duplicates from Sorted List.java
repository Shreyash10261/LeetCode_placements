// Title: Remove Duplicates from Sorted List
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

        ListNode t=head;
        while(t!=null && t.next!=null)
        {
            if(t.val==t.next.val)
            {
                t.next=t.next.next;
            }
            else
            {
                t=t.next;
            }
        }
        return head;
    }
