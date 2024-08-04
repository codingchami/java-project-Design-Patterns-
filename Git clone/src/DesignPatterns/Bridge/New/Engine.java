package DesignPatterns.Bridge.New;

abstract public class Engine {

    protected String type;
    protected int speed;

    public abstract void assemble();

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
