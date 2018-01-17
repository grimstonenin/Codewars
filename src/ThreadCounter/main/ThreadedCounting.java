package ThreadCounter.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadedCounting {
    public static void countInThreads(Counter counter) {
        ExecutorService[] pool = new ExecutorService[3];

        for(int i = 0; i<3; i++){
            pool[i] = Executors.newFixedThreadPool(1);
        }

        for(int i = 1; i<=100; i++) {
            int n = i;
            Runnable r = () -> counter.count(n);

            try {
                if (i % 3 == 0) {
                    pool[0].submit(r).get();
                } else if (i % 3 == 1) {
                    pool[1].submit(r).get();
                } else {
                    pool[3].submit(r).get();
                }
            } catch (InterruptedException | ExecutionException ex) {

            }

        }
            for(int i = 0; i<3; i++){
                pool[i].shutdown();
            }
        }
    }

class Counter{
    public static int count(int n){
        return n;
    }
}