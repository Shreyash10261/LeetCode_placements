// Title: Delete the Middle Node of a Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}
