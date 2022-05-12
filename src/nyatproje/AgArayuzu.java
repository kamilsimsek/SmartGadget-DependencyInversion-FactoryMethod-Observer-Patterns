package nyatproje;

public class AgArayuzu implements IAgArayuzu {

    private IAgArayuzu veritabani;

    public AgArayuzu(IAgArayuzu veritabani){
        this.veritabani = veritabani;
    }

    @Override
    public KullaniciHesabi kullaniciKontrol(String kullaniciAdi, int sifre) {
        return veritabani.kullaniciKontrol(kullaniciAdi,sifre) ;
    }
}
