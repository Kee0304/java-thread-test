package org.example.step01createthread;

// Block: 어떤 스레드가 현재 작업을 수행할 자격이 없는 상태
// 작업을 수행 중인 다른 스레드에 의해서 모니터 락이 걸려서 작업이 대기 상태로 전환

// 다른 스레드에 의해서 임계영역에 접근하려고 할 때 blocked

public class Ex05 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BlockedThread());
        Thread t2 = new Thread(new BlockedThread());

        // 각각의 스레드 실행
        t1.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println(t2.getState());
    }
}

class BlockedThread implements Runnable {

    @Override
    public void run() {
        criticalArea();
    }

    // 임계 영역: 특정 시점에는 하나의 스레드만 접근할 수 있는 영역
    // 공유 리소스에 해당하는 criticalArea 메서드
    public static synchronized void criticalArea() {
        while (true) {

        }
    }
}