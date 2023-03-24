package com.example.javafxgradle2.utils.observer;


import com.example.javafxgradle2.utils.events.Event;

public interface Observer<E extends Event> {
    void update(E e);
}