package nyatproje;

public class SogutucuAcFactory implements ISogutucuIslemFactory{
    public ISogutucuIslem factoryMethod() throws InterruptedException {
        return new SogutucuAc();
    }
}
