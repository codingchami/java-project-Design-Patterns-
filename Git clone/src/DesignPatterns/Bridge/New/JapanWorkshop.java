package DesignPatterns.Bridge.New;

public class JapanWorkshop extends Workshop{

    public JapanWorkshop(Engine engine) {
        super(engine);
    }

    @Override
    void setType() {
        engine.setType("Japan Type");
    }

    @Override
    void setSpeed() {
        engine.setSpeed(500);
    }
}
