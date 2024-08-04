package DesignPatterns.Adapter;

public class Initilaize {

    public static void main(String[] args) {

        Charger vivo = new Vivo();
        vivo.chargingPort(new Vivo());

        Charger pixel = new PixelPhoneChargingAdapter(new Pixel());
        pixel.chargingPort(new Vivo());
    }

}
