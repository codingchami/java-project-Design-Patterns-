package DesignPatterns.Bridge.New;

public class USAWorkShop extends Workshop{

    public USAWorkShop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("Type USA");
    }

    @Override
    void setSpeed() {
       engine.setSpeed(250);
    }
}
