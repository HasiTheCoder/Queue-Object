import javax.print.attribute.standard.MediaSize;

public class OtherQueue {
    private int[] OtherQueue;
    private int back;
    private int front;
    public OtherQueue() {
        OtherQueue = new int[100];
        back = 0;
        front = 0;
    }

    public OtherQueue(int size) {
        OtherQueue = new int[size];
        back = 0;
        front = 0;
    }

    public OtherQueue(int[] QueueN, int numbersEnter, int size) {
        OtherQueue = new int[size];
        for (int i = 0; i < QueueN.length; i++) {
            OtherQueue[i] = QueueN[i];
        }
        back = numbersEnter-1;
        front = 0;
    }

    public boolean isFull() {
        if (size() == OtherQueue.length) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public void enqueue(int i) {
        if (isFull()) {
            System.out.println("Queue if full");
        } else {
            back++;
            OtherQueue[back] = i;
        }
    }

    public String dequeue() {
        if (isEmpty()) {
            return "OtherQueue is empty";
        } else {
            int value = OtherQueue[0];
            for (int i = 0; i < back; i++) {
                OtherQueue[i] = OtherQueue[i + 1];
            }
            back--;
            return "" + value;
        }
    }

    public int size() {
        return back - front + 2;
    }

    public String front() {
        if (isEmpty()) {
            return "OtherQueue is empty";
        }
        return "" + OtherQueue[0];
    }

    public void makeEmpty() {
        back = 0;
    }

    public String toString() {
        String values = "";
        for (int i = 0; i < back; i++) {
            values += OtherQueue[i] + " ";
        }
        return values;
    }
}