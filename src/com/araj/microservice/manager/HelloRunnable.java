package com.araj.microservice.manager;

public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello Runnable!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

}