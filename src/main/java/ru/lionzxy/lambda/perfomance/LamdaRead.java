package ru.lionzxy.lambda.perfomance;

import org.apache.commons.lang3.SerializationUtils;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import ru.lionzxy.lambda.samples.utils.SeriliazationRunnable;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class LamdaRead {

    @Param({"8", "16", "32", "64", "128"})
    int pseudoRandom;
    byte[] data;

    @Setup(Level.Iteration)
    public void setup() {
        final int localVal = pseudoRandom;
        data = SerializationUtils.serialize((SeriliazationRunnable) () -> {
            System.out.println("Test" + localVal);
        });
    }

    @Benchmark
    public void read() {
        SeriliazationRunnable runnable = SerializationUtils.deserialize(data);
    }
}
