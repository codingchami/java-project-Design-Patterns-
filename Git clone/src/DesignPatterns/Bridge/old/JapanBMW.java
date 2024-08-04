package DesignPatterns.Bridge.old;

public class JapanBMW extends Engine{
    @Override
    public void assemble() {
        System.out.println("Japn BMW type :"+type);
        System.out.println("Japn BMW Speed :"+speed);
    }
}
