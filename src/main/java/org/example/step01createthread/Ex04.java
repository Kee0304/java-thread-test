package org.example.step01createthread;

// Runnable: 실행 대기 상태와 실제 실행 중인 상태를 둘 다 표현함
// 실제로 실행 상태(RUNNING)로 전환되려면 반드시 RUNNABLE 상태를 거쳐야 하

public class Ex04 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("스레드 ID: " + Thread.currentThread().getId() );
        });

        thread.start();

        System.out.println(thread.getState());
    }
}
