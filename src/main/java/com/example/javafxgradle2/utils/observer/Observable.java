package com.example.javafxgradle2.utils.observer;


import com.example.javafxgradle2.utils.events.Event;

public interface Observable<E extends Event> {
    void addObserver(Observer<E> e);
    void removeObserver(Observer<E> e);
    void notifyObservers(E t);
}
