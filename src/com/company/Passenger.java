package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Passenger extends Thread {

    Semaphore semaphore2;
    CountDownLatch cdl;


    public Passenger(String name, CountDownLatch cdl, Semaphore semaphore2) {
        super(name);
        this.cdl = cdl;
        this.semaphore2 = semaphore2;
    }

    @Override
    public void run() {
        try {


            semaphore2.acquire();
            System.out.println(getName() + "  купил билет  Бишкек - Ош");

            sleep(2000);


            semaphore2.release();

            cdl.countDown();

        } catch (InterruptedException e) {

        }
    }
}

