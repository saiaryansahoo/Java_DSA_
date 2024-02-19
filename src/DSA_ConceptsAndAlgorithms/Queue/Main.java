package DSA_ConceptsAndAlgorithms.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();

        queue.EnQueue(12);
        queue.EnQueue(1);
        queue.EnQueue(13);
        queue.EnQueue(2);
        queue.EnQueue(14);

        queue.DeQueue();
        queue.EnQueue(3);

        queue.getSize();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());



        queue.Show();
    }
}
