package easy;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class SortedInsertLinkedList {
    Node1 sortedInsert(Node1 head1, int key) {
        Node1 currNode = head1;
        Node1 newNode = new Node1(key);
        if(key < currNode.data){
            newNode.next = currNode;
            return newNode;
        }
        while(currNode.next!=null){
            if(key < currNode.next.data){
                break;
            }
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        return head1;
    }
}
