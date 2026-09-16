/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fp=head;
        ListNode sp=head;
        while(fp!=null&&fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
            if(fp==sp){
                ListNode start=head;
                while(start!=sp){
                    sp=sp.next;
                    start=start.next;
                }
                return start;
            }
        }
        return null;
    }
}