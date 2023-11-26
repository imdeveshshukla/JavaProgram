package LinkedList;

public class MeraLinkedList {
    Node head = new Node();
    public MeraLinkedList(int n){
        head.data = n;
        head.next = null;
    }
    static class Node{
        Node next;
        int data;
        Node(){
            this.data = 0;
            this.next = null;
        }
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    public static void insert(MeraLinkedList i,int inp)
    {
        Node test = new Node(inp);
        //not completed
        Node currNode = i.head;
        while (currNode!=null) {
            currNode = currNode.next;
        }
        currNode = test;
    }
    public static void printL(MeraLinkedList i){
        Node currNode = i.head;
        while (currNode!=null) {
            System.out.print(currNode.data+" -> ");
        }
        System.out.print(currNode);
    }
}
