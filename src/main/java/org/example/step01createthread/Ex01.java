package org.example.step01createthread;


public class Ex01 {
    public static void main(String[] args) {
        ExtendsThread extendsThread = new ExtendsThread();

        extendsThread.start();
    }
}

// 1. Thread 클래스를 extends하여 구현
class ExtendsThread extends Thread {

    @Override
    public void run() {
        System.out.println("생성된 스레드 ID:" + Thread.currentThread().getId());
    }

}