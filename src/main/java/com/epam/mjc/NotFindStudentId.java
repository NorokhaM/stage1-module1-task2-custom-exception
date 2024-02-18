package com.epam.mjc;

public class NotFindStudentId extends IllegalArgumentException{
    public NotFindStudentId(String message) {
        super(message);
    }

}
