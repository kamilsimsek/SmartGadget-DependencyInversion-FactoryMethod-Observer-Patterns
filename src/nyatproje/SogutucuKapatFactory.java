package nyatproje;

public class SogutucuKapatFactory implements ISogutucuIslemFactory{
    @Override
    public ISogutucuIslem factoryMethod() throws InterruptedException {
        return new SogutucuKapat();
    }
}
