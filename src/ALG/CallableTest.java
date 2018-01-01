package ALG;

import java.util.concurrent.*;

public class CallableTest implements Callable<Integer>{

    public static void main(String[] args) {
//        CallableTest callableTest = new CallableTest();
//        FutureTask<Integer> futureTask = new FutureTask<Integer>(callableTest);
//        new Thread(futureTask,"zixianc").start();
//
//        try {
//            System.out.println("子线程返回值："+futureTask.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        ExecutorService service = new ThreadPoolExecutor(5,10,10,TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        service.execute(new Runnable() {
            @Override
            public void run() {

            }
        });

        Future<Integer> future = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return null;
            }
        });
        try {
            Integer num = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for(int j = 0;j<100;j++){
            i++;
        }
        return i;
    }
}
