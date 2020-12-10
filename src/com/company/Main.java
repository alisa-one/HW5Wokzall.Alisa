package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(100);

        Semaphore semaphore2=new Semaphore(4,true);

        System.out.println(" 4 кассы  вокзала открылись");

        for (int i = 1; i < 101; i++) {

            new Passenger("Пассажир " + i, cdl, semaphore2).start();

        }
        for (int j = 1; j< 5; j++) {
            new Avtobuss("Автобус  "+j,cdl).start();

        }



    }

}
