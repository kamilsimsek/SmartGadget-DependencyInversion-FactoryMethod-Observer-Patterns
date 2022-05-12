package nyatproje;

public class Eyleyici {

    private final ISogutucuIslemFactory sogutucuislem;

    public Eyleyici(ISogutucuIslemFactory sogutucuislem){
        this.sogutucuislem = sogutucuislem;
    }

    public void basla() throws InterruptedException {
        ISogutucuIslem islem1 = sogutucuislem.factoryMethod();

    }

}
