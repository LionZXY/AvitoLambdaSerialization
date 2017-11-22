package ru.lionzxy.lambda.samples.utils;

import java.io.Serializable;

public interface SeriliazationRunnable extends Runnable, Serializable {
    void run();
}
