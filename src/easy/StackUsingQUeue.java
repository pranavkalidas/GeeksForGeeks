package easy;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQUeue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    Queue<Integer> temp;

    //Function to push an element into stack using two queues.
    void push(int a)
    {
        q2.add(a);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        temp = q2;
        q2 = q1;
        q1 = temp;
    }

    //Function to pop an element from stack using two queues.
    int pop()
    {
        if(q1.isEmpty()){
            return -1;
        }
        return q1.remove();
    }
}
