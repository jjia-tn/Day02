package sdf;

public class Porche extends Car {
    
    private String turbo = "off";
    private int accelerate = 0;

    public Porche() {
        super.setColour("red");
    }

    public Porche(String colour, String registration) {
        super.setColour(colour);
        setRegistration(registration);
    }

    public String getTurbo() { return turbo; }

    // I can no longer change the colour of the car once it has been instantiated
    @Override
    public void setColour(String c) {}

    public void accelerate() {
        this.accelerate++;
        if (this.accelerate > 4) {
            this.turbo = "on";
        }
    }

    public void decelerate() {
        this.accelerate--;
        if (this.accelerate <= 4) {
            this.turbo = "off";
        }
    }

    public int getAccelerate() {
        return accelerate;
    }

}
