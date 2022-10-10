package feladat1;

public class Car{
    private String rendszam;
    private String marka;
    private double suly;
    private String szin;

    public Car(String rendszam, String marka, double suly, String szin) {
        this.rendszam = rendszam.toUpperCase();
        this.marka = marka;
        this.suly = suly;
        this.szin = szin;
    }

    @Override
    public String toString(){
        return "Car(" + this.marka+ "(" + this.rendszam + "), " + this.szin + ", " + this.suly + "0t)";
    }

    public String getBrand(){
        return this.marka;
    }
    public String getColor(){
        return this.szin;
    }

    public double getWeight(){
        return this.suly;
    }
    public boolean isLighterThan(Car masik){
        Car egyik = this;
        return egyik.suly < masik.suly;
    }

    public boolean requiresCLicense(){
        return this.suly > 3.5;
    }

    public String getLicensePlateNumber(){
        return this.rendszam;
    }

}