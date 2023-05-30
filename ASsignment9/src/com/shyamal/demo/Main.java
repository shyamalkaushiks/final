package com.shyamal.demo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private Queue<Integer> queue;
    private Random random;

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                // Generate a random number
                int number = random.nextInt(100);
                System.out.println("Produced: " + number);

                // Add the number to the queue
                queue.add(number);

                // Notify the consumer thread that a number is available
                queue.notify();

                try {
                    Thread.sleep(500); // Delay for better visibility
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Consumer implements Runnable {
    private Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                // Wait until a number is available in the queue
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Read the number from the queue
                int number = queue.poll();
                System.out.println("Consumed: " + number);

                // Calculate the sum of numbers
                int sum = calculateSum();

                System.out.println("Sum: " + sum);

                try {
                    Thread.sleep(500); // Delay for better visibility
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private int calculateSum() {
        int sum = 0;
        for (int number : queue) {
            sum += number;
        }
        return sum;
    }
}