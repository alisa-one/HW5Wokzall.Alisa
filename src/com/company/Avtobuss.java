package com.company;

import java.util.concurrent.CountDownLatch;

public class Avtobuss extends Thread {


    CountDownLatch cdl;


    public Avtobuss(String name, CountDownLatch cdl) {
        super(name);
        this.cdl=cdl;

    }

    @Override
    public void run() {
        try {
            cdl.await();
        System.out.println(getName() + " (25 чел) заполнен и поехал по маршруту Бишкек- Ош");

    } catch (InterruptedException e) {

    }
    }
}
