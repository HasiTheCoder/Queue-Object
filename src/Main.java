public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(9);
        q.enqueue(8);
        q.enqueue(5);
        q.enqueue(10);		//q: 9, 8, 5, 10
        System.out.println(q);
        System.out.println(q.dequeue());	//Display: 9	//8, 5, 10
        System.out.println(q.size());		//Display: 3
        System.out.println(q.dequeue());	//Display: 8	//5, 10
        System.out.println(q.front());		//Display: 5
        q.makeEmpty();			//Queue is empty
        System.out.println(q.size());		//0
    }
}