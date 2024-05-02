package org.example.tp_global_1;

import java.util.Observer;

public interface CarSubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}