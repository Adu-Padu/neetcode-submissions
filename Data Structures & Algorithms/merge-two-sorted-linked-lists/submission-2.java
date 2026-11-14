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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        ListNode newList = new ListNode();
        ListNode newListPointer = newList;

        if(list1 == null && list2 == null){
            return null;
        }
        



        while (pointer1 != null || pointer2 != null){
            if(pointer1 == null){

                newListPointer.val = pointer2.val;
                pointer2 = pointer2.next;
                
                if(pointer2 != null){
                    newListPointer.next = new ListNode();
                    newListPointer = newListPointer.next;
                }
                
            }else if(pointer2 == null){

                newListPointer.val = pointer1.val;
                pointer1 = pointer1.next;
                
                if(pointer1 != null){
                    newListPointer.next = new ListNode();
                    newListPointer = newListPointer.next;
                }

            }else{
                if(pointer2.val < pointer1.val){
                    newListPointer.val = pointer2.val;
                    newListPointer.next = new ListNode();
                    newListPointer = newListPointer.next;
                    pointer2 = pointer2.next;

                }else{
                    newListPointer.val = pointer1.val;
                    newListPointer.next = new ListNode();
                    newListPointer = newListPointer.next;
                    pointer1 = pointer1.next;
                }
            }
        }

        return newList;
        
    }
}