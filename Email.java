package edu.dmacc.codedsm.hw16;

public class Email implements TaskAssigner {
    @Override
    public void assign() {
        System.out.println("Email message");
    }
}
