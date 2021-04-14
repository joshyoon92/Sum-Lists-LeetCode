package com.company;
import java.util.LinkedList;

public class SumLists {
    public LinkedList sumLists(LinkedList l1, LinkedList l2, int carry){
        if (l1 == null && l2 ==null && carry ==0){
            return null;
        }
        LinkedList<Integer> result = new LinkedList<>();
        int value = carry;
        if (l1 != null) {
            value += l1.data;
        }
        if (l2 != null) {
            value +=l1.data;
        }
        result.data = value%10;
        if (l1 != null || l2 != null) {
            LinkedList more = sumLists(l1 ==null ? null : l1.next(), l2 == null ? null : l2.next, value >= 10 ? 1:0);
            result.setNext(more);
        }
        return result;
    }
}