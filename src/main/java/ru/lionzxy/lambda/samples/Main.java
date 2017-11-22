package ru.lionzxy.lambda.samples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

    public static void main(String[] args) throws Exception {
        LambdaSerialization lambdaSerialization = new LambdaSerialization();
        lambdaSerialization.test();

        MyClassTest classTest = new MyClassTest();
        classTest.test();
    }

    public static void serialization(Serializable runnable, String name) throws Exception {
        FileOutputStream fos = new FileOutputStream("./files/" + name + ".out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(runnable);
        oos.flush();
        oos.close();
    }
}
