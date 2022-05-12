package nyatproje;

import java.util.Random;

public class SicaklikAlgilayici {
    private double sicaklik;

    public double SicaklikGonder() throws InterruptedException {
        Random rand = new Random();
        int sica = 15;
        int min = 15;
        Thread.sleep(1500);
        sicaklik = rand.nextInt(sica)+min;
        return sicaklik;
    }

    public double getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(double sicaklik) {
        this.sicaklik = sicaklik;
    }


}
