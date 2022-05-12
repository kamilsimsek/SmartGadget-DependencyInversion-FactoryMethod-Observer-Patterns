package nyatproje;
import java.util.Scanner;
public class Sogutucu {

    private KullaniciHesabi kullaniciKontrolEt(String kullaniciAdi, int sifre, IAgArayuzu agArayuzu){
        return agArayuzu.kullaniciKontrol(kullaniciAdi,sifre);
    }

    public void giris() throws InterruptedException {
        Scanner okuyucu = new Scanner(System.in);

        System.out.println("Açılış testi yapılıyor...");
        Thread.sleep(200);
        System.out.println("Sistem açıldı !");

        System.out.print("Kullanıcı Adı : ");
        String kullaniciAdi = okuyucu.next();

        System.out.print("Şifre : ");
        int sifre = Integer.parseInt(okuyucu.next());

        IAgArayuzu agArayuzu = new AgArayuzu(new Postgresql());
        KullaniciHesabi kullaniciHesabi = kullaniciKontrolEt(kullaniciAdi,sifre,agArayuzu);

        if(kullaniciHesabi != null)
        {
            System.out.println("Kullanıcı doğrulama başarılı ! "+kullaniciHesabi);
            Menu();
        }
        else{
            System.out.println("Kullanıcı doğrulanamadı !");
        }

    }

        ISogutucuIslemFactory sogutucuIslemFactory;
    public void Menu() throws InterruptedException {
        Boolean flag = true;
        int secim;
        do {
            System.out.println("---------------------------------------");
            System.out.println("1-> Soğutucu Aç");
            System.out.println("2-> Soğutucu Kapat");
            System.out.println("3-> Sıcaklık Görüntüle");
            System.out.println("4-> Çıkış");
            System.out.println("---------------------------------------");
            System.out.print("Seçim : ");
            Scanner oku = new Scanner(System.in);
            secim = Integer.parseInt(oku.next());


            switch (secim) {
                case 1:
                    sogutucuIslemFactory = new SogutucuAcFactory();
                    Eyleyici ey1 = new Eyleyici(sogutucuIslemFactory);
                    Subscriber1 sub1 = new Subscriber1();
                    Subscriber2 sub2 = new Subscriber2();
                    Publisher p = new Publisher();
                    p.attach(sub1);
                    p.attach(sub2);
                    KullaniciHesabi kullaniciHesabi = new KullaniciHesabi("kullanıcı adı",p);
                    kullaniciHesabi.getMesaj();
                    ey1.basla();
                    break;
                case 2:
                    sogutucuIslemFactory = new SogutucuKapatFactory();
                    Eyleyici ey2 = new Eyleyici(sogutucuIslemFactory);
                    ey2.basla();
                    break;
                case 3:
                    System.out.println("Sıcaklık görüntüleme işlemi başlatılıyor...");
                    SicaklikAlgilayici sicaklik = new SicaklikAlgilayici();
                    System.out.println("Sıcaklık Değeri : "+ sicaklik.SicaklikGonder());
                    Thread.sleep(1500);
                    break;
                case 4:
                    System.out.println("Sistem kapatılıyor...");
                    Thread.sleep(1500);
                    System.out.println("Sistem Kapatıldı !");
                    break;
                default:
                    System.out.println("Servis Dışı");
                    flag = false;
                    break;

            }
        }while(secim != 4 && flag);
    }



}
