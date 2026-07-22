import java.util.ArrayDeque;
import java.util.Queue;

class queue{
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        //add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);

        //remove
        queue.poll();
        queue.remove();
        System.out.println(queue);

        //peek
        System.out.println(queue.peek());

        //size
        System.out.println(queue.size());

        //empty
        System.out.println(queue.isEmpty());

        //search
        System.out.println(queue.contains(30));
    }
}