package ALG;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    private static ReentrantLock lock = new ReentrantLock();
    private static Condition conditionA = lock.newCondition();
    private static Condition conditionB = lock.newCondition();

    public static void main(String[] args) {

        Thread threadA = new Thread(runnableA,"threadA");
        Thread threadB = new Thread(runnableB,"threadB");

        threadA.start();
        threadB.start();

    }

    static Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            lock.lock();
            try {
                conditionA.await();
                System.out.println("进入RunnableA ");
                System.out.println("退出RunnableA ");
            } catch (InterruptedException e) {
                e.printStackTrace();
                conditionB.signal();
            }
            lock.unlock();
        }
    };

    static Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            lock.lock();

                System.out.println("进入RunnableB ");
                System.out.println("退出RunnableB ");
                conditionA.signalAll();

            lock.unlock();
        }
    };

}
