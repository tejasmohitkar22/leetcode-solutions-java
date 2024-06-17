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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode trav = head;
        if(head == null || head.next == null){
            return head;
        }
        while(trav.next != null){
            int first = trav.val;
            int second = trav.next.val;

            int divisor =  findGretestDivisor(new int[]{first, second});

            ListNode nn = new ListNode(divisor);
            nn.next = trav.next;
            trav.next = nn;
            trav = nn.next;
        }
        return head;
    }

    public static int findGretestDivisor(int arr[]){
        int smallest = arr[0] > arr[1] ? arr[1] : arr[0];
        int largest = arr[0] < arr[1] ? arr[1] : arr[0];

        int i = 2;
        int divisor = smallest;
        while(divisor > 0){
            if(largest % divisor == 0 && smallest % divisor == 0){
                return divisor;
            }
            divisor--;
        }
        return 1;
    }
}