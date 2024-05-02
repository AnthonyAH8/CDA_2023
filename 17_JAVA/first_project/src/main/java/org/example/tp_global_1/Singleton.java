package org.example.tp_global_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static Singleton instance;
    private static Lock lock = new ReentrantLock();

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
                if (instance == null) {
                    instance = new Singleton();
                }
        }
        return instance;
    }
}
