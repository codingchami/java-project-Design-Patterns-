package DesignPatterns.Bridge.New;

public class Initialize {

    public static void main(String[] args) {

        USAWorkShop usaWorkShop = new USAWorkShop(new BMW());
        usaWorkShop.process();

        System.out.println("===============================");

        JapanWorkshop japanWorkshop = new JapanWorkshop(new Audi());
        japanWorkshop.process();
    }
}
