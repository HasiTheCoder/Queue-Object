public class OtherQueue {
    private int[] Queue;
    private int back;
    private int front;
    public OtherQueue() {
        Queue = new int[100];
        back = 0;
        front = 0;
    }

    public OtherQueue(int size) {
        Queue = new int[size];
        back = 0;
        front = 0;
    }

    public OtherQueue(int[] QueueN, int numbersEnter) {
        Queue = QueueN;
        back = numbersEnter;
        front = 0;
    }

    public boolean isFull() {
        if (back == Queue.length) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (back == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int i) {
        if (isFull()) {
            System.out.println("Queue if full");
            return;
        } else {
            Queue[back] = i;
            back++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = Queue[0];
            for (int i = 0; i < back; i++) {
                Queue[i] = Queue[i + 1];
            }
            back--;
            return value;
        }
    }

    public int size() {
        return back;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return Queue[0];
    }

    public void makeEmpty() {
        back = 0;
    }

    public String toString() {
        String values = "";
        for (int i = 0; i < back; i++) {
            values += Queue[i] + " ";
        }
        return values;
    }
}