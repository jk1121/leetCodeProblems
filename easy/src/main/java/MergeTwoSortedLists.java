package main.java;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);
        ListNode mergedList = mergeTwoLists(list1, list2);
        printList(mergedList);
    }

    private static void printList(ListNode mergedList) {
        while (mergedList != null) {
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode currentNode = null;
        while (list1 != null && list2 != null) {
            ListNode newNode = new ListNode();
            if (list1.val <= list2.val) {
                newNode.val = list1.val;
                list1 = list1.next;
            } else {
                newNode.val = list2.val;
                list2 = list2.next;
            }
            if (head == null) {
                head = currentNode = newNode;
            } else {
                currentNode.next = newNode;
                currentNode = currentNode.next;
            }
        }

        while (list1 != null) {
            if (head == null) {
                head = currentNode = new ListNode(list1.val);
            } else {
                currentNode.next = new ListNode(list1.val);
                currentNode = currentNode.next;
            }

            list1 = list1.next;
        }
        while (list2 != null) {
            if (head == null) {
                head = currentNode = new ListNode(list2.val);
            } else {
                currentNode.next = new ListNode(list2.val);
                currentNode = currentNode.next;
            }
            list2 = list2.next;
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
