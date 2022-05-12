package nyatproje;

public class SogutucuKapat implements ISogutucuIslem {

    SogutucuKapat() throws InterruptedException {

        System.out.println("Soğutucu kapatma işlemi başlatılıyor...");
        sogutucuIslemBaslat();
    }


    @Override
    public void sogutucuIslemBaslat() throws InterruptedException {
        System.out.println("Sogutuçu kapatılıyor");
        for(int i = 0; i<5; i++){
            System.out.println(".");
            Thread.sleep(500);
        }
        System.out.println("Soğutucu Kapatıldı!");
    }
}
