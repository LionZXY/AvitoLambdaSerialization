package ru.lionzxy.lambda.perfomance;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(LambdaPerfomance.class.getSimpleName())
                .include(LamdaRead.class.getSimpleName())
                .include(ObjectPerfomance.class.getSimpleName())
                .include(ObjectRead.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}
