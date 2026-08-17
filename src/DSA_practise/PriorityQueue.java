package DSA_practise;

import java.util.PriorityQueue;

class pq{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //to change the priority do
        // PriorityQueue<Integer> DSA_practise.pq=new PriorityQueue<>(Collections.reverseOrder());

        //put(O(logn))
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(10);
        System.out.println(pq);

        //get(O(logn))
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        //peek(O(1))
        System.out.println(pq.peek());

        //size(O(1))
        System.out.println(pq.size());

        //empty
        System.out.println(pq.isEmpty());
    }
}