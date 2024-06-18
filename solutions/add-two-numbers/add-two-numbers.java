import java.math.BigInteger;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ListNode trav1 = l1;
        ListNode trav2 = l2;

        while(trav1 != null || trav2 != null){
            if(trav1 != null){
                sb1.append(trav1.val);
                trav1 = trav1.next;
            }
            if(trav2 != null){
                sb2.append(trav2.val);
                trav2 = trav2.next;
            }
        }
        BigInteger val1 = new BigInteger(sb1.reverse().toString());
        BigInteger val2 = new BigInteger(sb2.reverse().toString());
        String str = val1.add(val2).toString();

        // System.out.println(val1 + " " + val2 + " " + str);

        ListNode nn = new ListNode(0);
        ListNode newNode = nn;

        for(int i = str.length() - 1; i >= 0; i--){
            ListNode n1 = new ListNode(Character.getNumericValue(str.charAt(i)));
            nn.next = n1;
            nn = nn.next;
        }

        return newNode.next;

    }
}