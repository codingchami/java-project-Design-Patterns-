package DesignPatterns.Bridge.old;

public class JapanAudi extends Engine{
    @Override
    public void assemble() {
        System.out.println("Japan Audi Type :"+type);
        System.out.println("Japan Audi Speed :"+speed);
    }
}
