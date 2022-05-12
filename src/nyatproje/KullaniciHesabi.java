package nyatproje;

public class KullaniciHesabi {
    private String kullaniciAdi;
    private Kullanici kullanici;
    ISubject publisher;

    public KullaniciHesabi(String kullaniciAdi, String adi){
        this.kullaniciAdi=kullaniciAdi;
        this.kullanici=new Kullanici(adi);
    }
    public KullaniciHesabi(String kullaniciAdi, ISubject publisher) {
        this.kullaniciAdi=kullaniciAdi;
        this.publisher = publisher;
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
    public Kullanici getKullanici() {
        return kullanici;
    }
    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
    public void getMesaj() {
        publisher.notify("{\"adi\":"+this.kullaniciAdi+" sogutucu "+
                "acıldı}");
}
    @Override
    public String toString() {
        return "KullaniciHesabi{" + "adi:"+
                kullanici.getAd()+ '}';
    }

}
