package data_structure;

public class PQMain {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.add(5);
        queue.add(3);
        queue.add(7);
        queue.add(1);
        queue.add(3);
        System.out.println(queue);

        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
