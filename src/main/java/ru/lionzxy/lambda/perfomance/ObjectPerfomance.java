package ru.lionzxy.lambda.perfomance;

import org.apache.commons.lang3.SerializationUtils;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import ru.lionzxy.lambda.samples.utils.SRImplement;
import ru.lionzxy.lambda.samples.utils.SeriliazationRunnable;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class ObjectPerfomance {
    @Param({"8", "16", "32", "64", "128"})
    int pseudoRandom;

    @Benchmark
    public void writeRead() {
        final int localVal = pseudoRandom;

        final byte[] tmp = SerializationUtils.serialize(new SRImplement(localVal));
        SeriliazationRunnable runnable = SerializationUtils.deserialize(tmp);
    }

    @Benchmark
    public void write() {
        final int localVal = pseudoRandom;
        final byte[] tmp = SerializationUtils.serialize(new SRImplement(localVal));
    }
}
