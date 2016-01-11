package homework_02;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by a.krivosheev on 11.01.2016.
 */
public class QueueTest {

    public static void main(String[] args) {

        /*
        * Создадим класс Очереди
        * */

        Queue<Integer> myQueue = new PriorityQueue<>(10);

        /*
        * Заполним очередь
        * */
        boolean put;
        for (int i = 0; i < 12; i++) {
            put = myQueue.offer(i);
            System.out.println("Put element " + "[" + i + "]" + "; operation " + put);
        }

        /*
        * Выведем размер очереди
        * */
        System.out.println("Size queue: " + myQueue.size());

        /*
        * Выгрузим очередь
        * */
        int queueSize = myQueue.size();
        for (int i = 0; i < queueSize; i++) {
            System.out.println("Take element " + i + ": [" + myQueue.poll() + "]" );
        }
        System.out.println("Queue is empty");

        /*
        * Проверим размер очереди
        * */
        System.out.println("Queue size: " + myQueue.size());
    }
}
