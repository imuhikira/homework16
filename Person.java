package edu.dmacc.codedsm.hw16;

public class Person implements TaskAssigner {

    @Override
    public void assign() {
        System.out.println("Person message");
    }
}
