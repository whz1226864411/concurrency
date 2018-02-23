package com.creat.arithmetic;

import org.junit.Test;

import java.util.Stack;

/**
 * Created by Administrator on 2018-02-23.
 */
public class Five {

    private class ListNode {
        private int num;
        private ListNode next;

        private ListNode(int num) {
            this.num = num;
        }
    }

    @Test
    public void test() {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        printList(node1);
    }

    public void printList(ListNode node) {
        Stack<ListNode> stack = new Stack<ListNode>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().num);
        }
    }
}
