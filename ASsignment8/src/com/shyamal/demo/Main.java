package com.shyamal.demo;


public class Main {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread oddThread = new Thread(new OddNumberPrinter());

        evenThread.start();
        oddThread.start();
    }
}

class EvenNumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);

            try {
                Thread.sleep(500); // Delay for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);

            try {
                Thread.sleep(500); // Delay for better visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}