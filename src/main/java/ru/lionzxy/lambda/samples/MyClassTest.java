package ru.lionzxy.lambda.samples;

import ru.lionzxy.lambda.samples.utils.SeriliazationRunnable;

public class MyClassTest {
    private int test2 = 1;

    public void test() throws Exception {
        int test = 1;
        Main.serialization(new SeriliazationRunnable() {
            @Override
            public void run() {
                System.out.println("Test" + test);
                System.out.println("Test" + test2);
            }
        }, "anonymObject");
    }
}
