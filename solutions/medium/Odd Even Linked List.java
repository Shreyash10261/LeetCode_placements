// Title: Odd Even Linked List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/odd-even-linked-list/

            fast = fast.next;
            }
            slow.next = fast.next;
            slow = slow.next;
        }

        fast.next = evenHead;
        return head;
    }
}
