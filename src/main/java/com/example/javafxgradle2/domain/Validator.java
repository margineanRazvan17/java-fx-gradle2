package com.example.javafxgradle2.domain;

public interface Validator<T> {
    void validate(T entity) throws ValidationException;
}