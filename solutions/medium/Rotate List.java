// Title: Rotate List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-list/

        }
            while (fast!=null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        fast.next = head;

        return a;
            fast=fast.next;
        {
        for(int i=0;i<k;i++)
        slow=head;
        }
