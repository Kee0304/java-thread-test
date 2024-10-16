package org.example.step01createthread;


public class Ex03 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }
    }
}

class MyRunnable implements Runnable {
    private final int threadId;

    public MyRunnable(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": 스레드 실행 중...");
        firstMethod(threadId);
    }

    private void firstMethod(int threadId) {
        int localValue = threadId + 100; // 각 스레드마다 고유한 스택에 존재 -> 공유 안 됨
        secondMethod(localValue);
    }

    private void secondMethod(int localValue) {
        System.out.println("생성된 스레드 ID: " + Thread.currentThread().getId());
        System.out.println("localValue = " + localValue);
    }
}
