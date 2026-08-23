// Title: Intersection of Two Linked Lists
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/intersection-of-two-linked-lists/

        }
    }
    while(t1!=t2)
    {
        t1=t1.next;
        t2=t2.next;
    }
    return t1;
}
}
