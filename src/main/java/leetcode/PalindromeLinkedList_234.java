package leetcode;

import java.util.ArrayList;

public class PalindromeLinkedList_234 {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> array = new ArrayList<>();
        int length = 0;
        ListNode current = head;
        while(current != null){
            array.add(head.val);
            length++;
        }

        if(length%2 != 0){
            return false;
        } else {
            for(int i=0; i< length/2; i++){
                if(array.get(i) != array.get(length-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}

