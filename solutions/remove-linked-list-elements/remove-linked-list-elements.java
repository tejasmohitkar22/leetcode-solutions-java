/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode nn = new ListNode();
        nn.next = head;
        ListNode listNode = nn;

        if(head == null){
            return null;
        }

        while(listNode.next != null){
            if(listNode.next.val == val){
                listNode.next = listNode.next.next;
            }
            else{
                listNode = listNode.next;
            }
        }
        return nn.next; 
    }
}