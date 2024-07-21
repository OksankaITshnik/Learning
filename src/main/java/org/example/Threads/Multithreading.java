package org.example.Threads;

import org.example.Threads.MultithreadThing;

public class Multithreading {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            MultithreadThing myThread = new MultithreadThing(i);
            Thread thread = new Thread(myThread);
            thread.start();
            System.out.println(thread.isAlive());
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(thread.isAlive());
        }
    }
}
