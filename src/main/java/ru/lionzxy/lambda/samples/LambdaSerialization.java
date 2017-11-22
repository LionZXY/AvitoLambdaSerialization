package ru.lionzxy.lambda.samples;

import ru.lionzxy.lambda.samples.utils.SeriliazationRunnable;

public class LambdaSerialization {
    private int test2 = 1;

    public void test() throws Exception {
        int test = 1;
        Main.serialization((SeriliazationRunnable) () -> {
            System.out.println("Test" + test);
        }, "lambdaSerialization");
    }
}
