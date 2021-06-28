package soalQueue;
public class TheApps {
    public static void main(String[] args) {
        mainQueue newQueue = new mainQueue(10);
        newQueue.enqueue(4);
        newQueue.show();
        newQueue.enqueue(8);
        newQueue.show();
        System.out.println("yang diambil dari antrian = "+newQueue.dequeue());
        System.out.println("Nama saya adalah Yusron Arly Bazarah");
        newQueue.show();
        newQueue.enqueue(7);
        newQueue.show();
        newQueue.enqueue(6);
        newQueue.show();
        System.out.println("nilai yang paling depan = "+newQueue.peek());
    }
}
