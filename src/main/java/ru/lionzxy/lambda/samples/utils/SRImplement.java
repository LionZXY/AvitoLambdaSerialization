package ru.lionzxy.lambda.samples.utils;

public class SRImplement implements SeriliazationRunnable {
    final int localVal;

    public SRImplement(int localVal){
        this.localVal = localVal;
    }

    @Override
    public void run() {
        System.out.println("Test" + localVal);
    }
}
