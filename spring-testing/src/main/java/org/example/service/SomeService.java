package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public void printSomething() {
        System.out.println("Something");
    }

    public boolean doSomething(boolean isSomething) {
        System.out.println(isSomething);
        return true;
    }

    public boolean isWorking(boolean isWorking) {
        return isWorking;
    }
}
