package concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunicationExample {

    public static void main(String args[]) {

        final Queue sharedQ = new LinkedList();

        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);

        producer.start();
        consumer.start();

    }
}

/*

The program will not terminate because the other two threads are still waiting and they are not daemon threads. 
The purpose of this notify and notifyAll example is to show How to use them and How to notify and notifyAll method works in Java.

*/






