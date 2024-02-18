package DSA_ConceptsAndAlgorithms.Queue;

public class Queue {
    int queue[]=new int[5];
    int size;
    int front;
    int rear;

    public void EnQueue(int data){
        queue[rear]=data;
        rear++;
        size++;
    }

    public void Show(){
        System.out.print("Elements : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[i]+ " ");
        }
    }
}
