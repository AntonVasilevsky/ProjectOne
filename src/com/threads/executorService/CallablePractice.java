package com.threads.executorService;

import java.util.Random;
import java.util.concurrent.*;

public class CallablePractice {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(() ->{
            System.out.println("Starting...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ended.");
            Random random = new Random();
            int result = random.nextInt(10);
            if(result<5){
                throw new Exception("Something bad happened");
            }
            return result;
        });
       executorService.shutdown();

        try {
            System.out.println("future "+future.get());   // ждет пока параллельный поток вернет значерние и потом выполняется
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            Throwable throwable = e.getCause();

            System.out.println(throwable.getMessage());
        }
        System.out.println("dd");

    }

}
