package org.example.step01createthread;

public class Ex02 {
    public static void main(String[] args) {
        ImplemenetsRunnable implemenetsRunnable = new ImplemenetsRunnable();
        Thread testThread = new Thread(implemenetsRunnable);
        testThread.start();
    }
}

class ImplemenetsRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("생성된 스레드 ID:" + Thread.currentThread().getId());
    }
}