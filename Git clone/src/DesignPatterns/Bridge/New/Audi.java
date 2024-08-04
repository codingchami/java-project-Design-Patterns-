package DesignPatterns.Bridge.New;

public class Audi extends Engine{
    @Override
    public void assemble() {
        System.out.println("Audi Type :"+type);
        System.out.println("Audi Speed :"+speed);
    }
}
