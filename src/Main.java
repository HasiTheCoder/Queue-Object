import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        Queue q = null;
        OtherQueue q2 = null;
        while ((choice = menu()) != 11) {
            input.nextLine();
            if ((q = QueueOptions(choice, q)) == null) {
                System.out.println("Queue not created");
            }
        }
        while ((choice = menu()) != 11) {
            input.nextLine();
            if ((q2 = OtherQueueOptions(choice, q2)) == null) {
                System.out.println("OtherQueue not created");
            }
        }
        System.out.println("Bye!!!! Have a great day.");

    }

    /**
     * Circular Queue options from options
     * @param choice
     * choice from the user based on menu
     * @param q2
     * declared object q2 of type OtherQueue
     * @return
     * Initialized or declared OtherQueue
     */
    public static OtherQueue OtherQueueOptions(int choice, OtherQueue q2) {
        //Default Other Queue
        if (choice == 1) {
            q2 = new OtherQueue();
        }
        //OtherQueue based on size provided from user input
        else if (choice == 2) {
            System.out.println("Enter the size of the OtherQueue: ");
            q2 = new OtherQueue(input.nextInt());
            input.nextLine();
        }
        //OtherQueue created with values provided from user input
        else if (choice == 3) {
            System.out.println("Enter the size of the Queue: ");
            int size = input.nextInt();
            input.nextLine();
            int[] values = GetQueueValues();
            q2 = new OtherQueue(values, values.length, size);
        }
        //enqueues values into the OtherQueue from user input
        else if (choice == 4) {
            if (q2 == null) {
                return q2;
            }
            else if (q2.isFull()) {
                System.out.println("OtherQueue is full, cannot add to the OtherQueue");
            }
            System.out.println("Enter the value to add to the Queue: ");
            int value = input.nextInt();
            input.nextLine();
            q2.enqueue(value);
        }
        //Dequeues values from the front of the OtherQueue
        else if (choice == 5) {
            if (q2 == null) {
                return q2;
            }
            else if (q2.dequeue().equals("OtherQueue is empty")) {
                System.out.println("Queue is empty");
            } else {
                System.out.println("Value removed: " + Integer.parseInt(q2.dequeue()));
            }
        }
        //Displays the front of the Queue
        else if (choice == 6) {
            if (q2 == null) {
                return q2;
            }
            if (q2.front().equals("OtherQueue is empty")) {
                System.out.println("OtherQueue is empty");
            }
            else {
                System.out.println("Front value of OtherQueue: " + Integer.parseInt(q2.front()));
            }
        }
        //Displays the size of the OtherQueue
        else if (choice == 7) {
            System.out.println("Size of OtherQueue: " + q2.size());
        }
        //Checks if the OtherQueue is empty or not
        else if(choice == 8) {
            if (q2.isEmpty()) {
                System.out.println("OtherQueue is empty");
            }
            else {
                System.out.println("OtherQueue is not empty");
            }
        }
        //Checks if the OtherQueue is full or not
        else if(choice == 9) {
            if (q2.isFull()) {
                System.out.println("OtherQueue is full");
            }
            else {
                System.out.println("OtherQueue is not full");
            }
        }
        //Displays the entire OtherQueue
        else if (choice == 10) {
            if (q2 == null) {
                return q2;
            }
            System.out.println(q2);
        }
        return q2;
    }

    /**
     * Linear queue options
     * @param choice
     * Choice by the user from menu
     * @param q
     * Declared object q of type Queue
     * @return
     * Initialized or updated queue
     */
    public static Queue QueueOptions(int choice, Queue q) {
        //Create default queue
        if (choice == 1) {
            q = new Queue();
        }
        //Create queue based on size provided by the user
        else if (choice == 2) {
            System.out.println("Enter the size of the Queue: ");
            q = new Queue(input.nextInt());
            input.nextLine();
        }
        //Creates queue based on values provided by the user
        else if (choice == 3) {
            System.out.println("Enter the size of the Queue: ");
            int size = input.nextInt();
            input.nextLine();
            int[] values = GetQueueValues();
            q = new Queue(values, values.length, size);
        }
        //Enqueues values to the queue from user input
        else if (choice == 4) {
            if (q == null) {
                return q;
            }
            else if (q.isFull()) {
                System.out.println("Queue is full, cannot add to the Queue");
            }
            else {
                System.out.println("Enter the value to add to the Queue: ");
                int value = input.nextInt();
                input.nextLine();
                q.enqueue(value);
            }
        }
        //Dequeues values from the front of the queue
        else if (choice == 5) {
            if (q == null) {
                return q;
            }
            else if (q.isEmpty()) {
                System.out.println("Queue is empty");
            }
            else {
                System.out.println("Value removed: " + q.dequeue());
            }
        }
        //Provides the front value of the queue
        else if (choice == 6) {
            if (q == null) {
                return q;
            }
            else if (q.front().equals("Queue is Empty")) {
                System.out.println("Queue is empty");
            }
            else {
                System.out.println("Front value: " + Integer.parseInt(q.front()));
            }
        }
        //Provides size of queue
        else if (choice == 7) {
            System.out.println("Size of queue: " + q.size());
        }
        //checks if queue is empty or not
        else if(choice == 8) {
            if (q.isEmpty()) {
                System.out.println("Stack is empty");
            }
            else {
                System.out.println("Stack is not empty");
            }
        }
        //Checks if queue is full or not
        else if(choice == 9) {
            if (q.isFull()) {
                System.out.println("Stack is full");
            }
            else {
                System.out.println("Stack is not full");
            }
        }
        //displays the entire queue
        else if (choice == 10) {
            if (q == null) {
                return q;
            }
            System.out.println(q);
        }
        return q;
    }

    /**
     * Determines the values of the queue from the user if using third overloaded constructor
     * @return
     * An array with the values of the Queue
     */
    public static int[] GetQueueValues() {
        System.out.println("Enter how many values you are providing: ");
        int amount = input.nextInt();
        input.nextLine();
        int[] values = new int[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("enter value " + (i+1) + ":");
            values[i] = input.nextInt();
            input.nextLine();
        }
        return values;
    }

    /**
     * Menu of options for the user to select from
     * @return
     * an int with the choice of the user
     */
    public static int menu() {
        System.out.println("""
                Enter the number of the choice
                1. Create a Queue with default size
                2. Create a Queue with a given size
                3. Create a Queue from an array
                4. Enqueue
                5. Dequeue
                6. Front
                7. Size
                8. Is Empty
                9. Is Full
                10. Display
                11. Exit
                Enter Choice:
                """);
        return input.nextInt();
    }
}