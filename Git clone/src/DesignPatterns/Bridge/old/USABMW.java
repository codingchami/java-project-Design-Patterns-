package DesignPatterns.Bridge.old;

public class USABMW extends Engine{
    @Override
    public void assemble() {
        System.out.println("USA BMW Type :"+type);
        System.out.println("USA BMW Speed :"+speed);
    }
}
