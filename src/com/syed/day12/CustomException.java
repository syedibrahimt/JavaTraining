package com.syed.day12;

import java.lang.Exception;

class SyedException extends Exception {
    public SyedException(String name) {
        super(name);
    }
}

public class CustomException {
    public static void main(String[] args) {
        String name = "Syed";
        try {
            if(name.equalsIgnoreCase("syed")) throw new SyedException("Name Should not be SYed");
        } catch (SyedException e) {
            System.out.println(e);
        }
    }
}
