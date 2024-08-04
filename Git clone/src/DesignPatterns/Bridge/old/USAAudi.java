package DesignPatterns.Bridge.old;

public class USAAudi extends Engine{
    @Override
    public void assemble() {
        System.out.println("USA Audi type :"+type);
        System.out.println("USA Audi Speed :"+speed);
    }
}
