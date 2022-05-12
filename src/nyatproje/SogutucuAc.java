package nyatproje;

public class SogutucuAc implements ISogutucuIslem {

    SogutucuAc() throws InterruptedException {
        System.out.println("Soğutucu açma işlemi başlatılıyor...");
        sogutucuIslemBaslat();
    }
    @Override
    public void sogutucuIslemBaslat() throws InterruptedException {
        System.out.println("Sogutuçu açılıyor");
        for(int i = 0; i<4; i++){
            System.out.println(".");
            Thread.sleep(500);
        }
        System.out.println("Soğutucu Açıldı!");
    }
}
