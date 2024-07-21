package org.example.Threads;

public class MultithreadThing implements Runnable {

    int threadNumber;
    public MultithreadThing(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run (){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " from thread number " + threadNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}