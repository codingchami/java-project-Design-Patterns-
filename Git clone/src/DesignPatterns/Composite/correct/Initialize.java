package DesignPatterns.Composite.correct;

public class Initialize {
    public static void main(String[] args) {

        Service service = new Service();

        service.totalOrder(
                new CompositeBox(
                        new Bottle("Bottle",50)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Bike("Bike",250)
                        )
                ),
                new Bottle("Bottle 02",25)
        );

        System.out.println("Total Order Cost is :"+service.calculateTotalOrderCost());
    }
}
