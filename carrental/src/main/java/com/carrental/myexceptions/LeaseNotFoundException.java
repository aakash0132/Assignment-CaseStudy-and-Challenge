package com.carrental.myexceptions;

public class LeaseNotFoundException extends Exception {
    public LeaseNotFoundException(String message) {
        super(message);
    }
}